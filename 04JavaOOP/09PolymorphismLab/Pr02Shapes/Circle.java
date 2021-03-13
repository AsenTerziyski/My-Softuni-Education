package Pr02Shapes;

import static java.lang.StrictMath.PI;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public final double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        if (getArea() == null) {
            double area = PI * this.radius * this.radius;
            setArea(area);
        }
        return getArea();
    }

    @Override
    public double calculatePerimeter() {
        if (getPerimeter() == null) {
            double perimeter = 2 * PI * this.radius;
            setPerimeter(perimeter);
        }
        return getPerimeter();
    }
}
