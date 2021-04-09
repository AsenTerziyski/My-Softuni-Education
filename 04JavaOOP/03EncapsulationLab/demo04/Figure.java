package demo04;

public abstract class Figure {
    private double area;

    protected double getArea() {
        return area;
    }

    protected double setArea() {
        return this.area;
    }





    @Override
    public String toString() {
        return String.format("%s => Area=%.2f", this.getClass().getSimpleName(), this.area);
    }
}
