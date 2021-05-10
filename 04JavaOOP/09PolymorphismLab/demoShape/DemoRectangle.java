package demoShape;

public class DemoRectangle extends DemoShape {
    private Double a;
    private Double b;

    public DemoRectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        if (getArea() == null) {
            double area = a * b;
            setArea(area);
        }
        return getArea();
    }

    @Override
    public double calculatePerimeter() {
        if (getPerimeter() == null) {
            double perimeter = 2 * (a+b);
            setPerimeter(perimeter);
        }
        return getPerimeter();
    }
}
