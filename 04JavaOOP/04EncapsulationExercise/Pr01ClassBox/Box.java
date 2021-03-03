package Pr01ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (isPositiveOrBiggerThanZero(length, "Length")) {
            this.length = length;
        }
    }

    private void setWidth(double width) {
        if (isPositiveOrBiggerThanZero(width, "Width")) {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (isPositiveOrBiggerThanZero(height, "Height")) {
            this.height = height;
        }
    }

    private boolean isPositiveOrBiggerThanZero(double side, String str) {
        if (side <= 0) {
            throw new IllegalArgumentException(str + " cannot be zero or negative");
        } else {
            return side > 0;
        }
    }

    public double calculateSurfaceArea() {
        double surfaceArea = 2 * (this.length * this.width + this.length * this.height + this.width * this.height);
        return surfaceArea;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (this.length * this.height + this.width * this.height);
    }

    public double calculateVolume() {
        return this.height * this.width * this.length;
    }
}
