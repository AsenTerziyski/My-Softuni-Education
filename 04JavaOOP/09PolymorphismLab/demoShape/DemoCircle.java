package demoShape;

public class DemoCircle extends DemoShape {
    private Double radius;

    public DemoCircle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        if (getArea() == null) {
            double area = Math.PI * this.radius * this.radius;
            setArea(area);
        }
        return getArea();
    }

    @Override
    public double calculatePerimeter() {
        if (getPerimeter() == null) {
            double perimeter = 2 * Math.PI * this.radius;
            setPerimeter(perimeter);
        }

        return getPerimeter();
    }
}
