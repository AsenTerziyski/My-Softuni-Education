package CreatePointInRectangle;

public class DmRectangle {
    private DmPoint bottomLeft;
    private DmPoint topRight;

    public DmRectangle(DmPoint bottomLeft, DmPoint topRight) {
        this.setBottomLeft(bottomLeft);
        this.setTopRight(topRight);
    }

    public DmPoint getBottomLeft() {
        return bottomLeft;
    }

    public DmPoint getTopRight() {
        return topRight;
    }

    private void setBottomLeft(DmPoint bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    private void setTopRight(DmPoint topRight) {
        this.topRight = topRight;
    }

    public boolean checkIfPointIsInRectangle (DmPoint checkPoint) {
        return checkPoint.isGreaterThanBottomLeftX(this.bottomLeft)
                && checkPoint.isSmallerThanTopRightX(this.topRight)
                && checkPoint.isGreaterThanBottomLeftY(this.bottomLeft)
                && checkPoint.isSmallerThanTopRightY(this.topRight);
    }
}
