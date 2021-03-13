package Pr02Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    protected Double getPerimeter() {
        return this.perimeter;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected Double getArea() {
        return this.area;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
