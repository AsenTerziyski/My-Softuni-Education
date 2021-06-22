package CircleCheckCrossProgram;

class Circle {
    private Point2D point2D;
    private double r;

    public Circle(Point2D point2D, double r) {
        this.point2D = point2D;
        this.r = r;
    }

    private void setR(double r) {
        this.r = r;
    }

    double getR() {
        return r;
    }

    Point2D getCenterCoordinates() {
        return point2D;
    }
}
