package demo02;

public class Figure {
    protected double area;

    public Figure() {
    }

    public Figure(double area) {
        this.area = area;
    }

    public double calculateArea () {
        this.area = this.area * 1;
        return this.area;
    }
}
