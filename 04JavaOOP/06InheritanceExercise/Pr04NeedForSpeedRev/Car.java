package demo01NeedForSpeed;

public class Car extends Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 5;
    private String color;

    public Car(double fuel, int horsePower, String color) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
        this.setColor(color);
    }

    private void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color can not be empty or null!");
        }
        this.color = color;
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption);
    }

    @Override
    public void drive(double kilometers) {
        super.drive(kilometers);
    }

    @Override
    public double getFuelConsumption() {
        return super.getFuelConsumption();
    }

    @Override
    public double getFuel() {
        return super.getFuel();
    }

    @Override
    public int getHorsePower() {
        return super.getHorsePower();
    }

    @Override
    public int getVehicleID() {
        return super.getVehicleID();
    }

    @Override
    public String toString() {
        return super.toString() + " The color is: " + this.color + "!";
    }
}
