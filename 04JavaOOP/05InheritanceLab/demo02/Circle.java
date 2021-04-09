package demo02;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double area) {
        area = Math.PI * Math.pow(this.radius,2);
        return area;
    }
}
