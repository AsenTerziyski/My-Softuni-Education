package demo07CalculateCubeVolume;

public class Cube {
    private double x;

    public static double calculateCubeVolume(double x) {
        return x * x * x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        double v = calculateCubeVolume(this.x);
        return "Volume = " + String.format("%2f", v);
    }
}
