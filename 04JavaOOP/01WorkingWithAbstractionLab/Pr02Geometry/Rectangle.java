package Pr02Geometry;

public class Rectangle {

    private Point2D bottomLeft;
    private Point2D topRight;

    public Rectangle(Point2D bottomLeft, Point2D topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }
//    public boolean contains(Point2D point) {
//        return point.getX() >= bottomLeft.getX() && point.getX() <= topRight.getX()
//                && point.getY() >= bottomLeft.getY() && point.getY() <= topRight.getY();
//    }
    public boolean contains(Point2D point) {
        return point.isGreaterThanBottomLeftX(this.bottomLeft.getX())
                && point.isSmallerThanTopRightX(this.topRight.getX())
                && point.isGreaterThanBottomLeftY(this.bottomLeft.getY())
                && point.isSmallerThanTopRightY(this.topRight.getY());
    }
}
