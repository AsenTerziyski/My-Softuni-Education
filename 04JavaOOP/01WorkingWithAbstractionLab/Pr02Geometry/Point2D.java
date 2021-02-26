package Pr02Geometry;

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean isGreaterThanBottomLeftX(Point2D otherX) {
        return this.x >= otherX.x;
    }
    public boolean isSmallerThanTopRightX(Point2D otherX) {
        return this.x <= otherX.x;
    }
    public boolean isGreaterThanBottomLeftY(Point2D otherY) {
        return this.y >= otherY.y;
    }
    public boolean isSmallerThanTopRightY(Point2D otherY) {
        return this.y <= otherY.y;
    }
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
}
