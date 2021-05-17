package builder;

public class Car {
    private String color;
    private boolean hasGasBottle;
    private String lightColor;
    private boolean hasFancyRims;
    private boolean isElectric;
    private int tyres;

    public Car withColor(String color) {
        this.color = color;
        return this;
    }

    public Car withGasBottle(boolean hasGasBottle) {
        this.hasGasBottle = hasGasBottle;
        return this;
    }

    public Car withLightColor(String lightColor) {
        this.lightColor = lightColor;
        return this;
    }

    public Car withFancyRims(boolean hasFancyRims) {
        this.hasFancyRims = hasFancyRims;
        return this;
    }

    public Car withElectric(boolean electric) {
        isElectric = electric;
        return this;
    }

    public Car withTyres(int tyres) {
        this.tyres = tyres;
        return this;
    }

    @Override
    public String toString() {
        return "X" + System.lineSeparator() +
                "Car => " + "color is: " + this.color + ", hasGasBottle=" + hasGasBottle + ", lightColor => " + lightColor +
                ", hasFancyRims => " + hasFancyRims + ", isElectric => " + isElectric + ", tyres = " + tyres + System.lineSeparator();
    }
}
