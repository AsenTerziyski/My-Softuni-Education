package demoShape;

public abstract class DemoShape {
    private Double perimeter;
    private Double area;

    public Double getPerimeter() {
        return this.perimeter;
    }

    public Double getArea() {
        return this.area;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public abstract double calculateArea ();
    public abstract double calculatePerimeter();

}
