package demo02;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    private double calculateArea(double recArea) {
        recArea = this.sideA * this.sideB;
        this.area = recArea;
        return recArea;
    }
}
