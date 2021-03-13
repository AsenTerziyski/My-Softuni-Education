package Pr02Shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double with, double height) {
        this.width = with;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        if (getArea() == null) {
            double area = this.width * this.height;
            setArea(area);
        }
        return getArea();
    }

    @Override
    public double calculatePerimeter() {
        if (getPerimeter() == null) {
            double perimeter = this.width * 2 + this.height * 2;
            setPerimeter(perimeter);
        }
        return getPerimeter();
    }
}
