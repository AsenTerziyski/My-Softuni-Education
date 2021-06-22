package CircleCheckCrossProgram;

class Point2D {
    private double x;
    private double y;


    Point2D(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    private void setX(double x) {
        this.x = x;
    }

    private void setY(double y) {
        this.y = y;
    }

    double getY() {
        return y;
    }

    double getX() {
        return x;
    }
}
