package Pr02Geometry;

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isGreaterThanBottomLeftX(int otherX) {
        return this.x >= otherX;
    }

    public boolean isSmallerThanTopRightX(int otherX) {
        return this.x <= otherX;
    }

    public boolean isGreaterThanBottomLeftY(int otherY) {
        return this.y >= otherY;
    }

    public boolean isSmallerThanTopRightY(int otherY) {
        return this.y <= otherY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
