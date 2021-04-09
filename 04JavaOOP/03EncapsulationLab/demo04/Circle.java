package demo04;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = this.setArea();
    }


    @Override
    protected double setArea() {
        if (radius<2.0) {
            throw new IllegalArgumentException("RadiusTooSmall");
        }
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Area" + this.area;
    }
}
