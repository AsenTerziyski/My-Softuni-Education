package demo04;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private double area;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = this.setArea();
    }

    @Override
    protected double setArea() {
        if (this.sideA == this.sideB) {
            System.out.println("Square");
            return sideA*sideA;
        }
        return sideA*sideB;
    }

    @Override
    protected double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Area" + this.area;
    }
}
