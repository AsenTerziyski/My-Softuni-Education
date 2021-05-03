package CreatePointInRectangle;

public class DmPoint {
    private int x;
    private int y;

    public DmPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isGreaterThanBottomLeftX(DmPoint otherDemoPoint) {
        return this.x >= otherDemoPoint.x;
    }

    public boolean isSmallerThanTopRightX(DmPoint otherDemoPoint) {
        return this.x < otherDemoPoint.x;
    }

    public boolean isGreaterThanBottomLeftY(DmPoint otherDemoPoint) {
        return this.y >= otherDemoPoint.y;
    }

    public boolean isSmallerThanTopRightY(DmPoint otherDemoPoint) {
        return this.y <= otherDemoPoint.y;
    }

}
