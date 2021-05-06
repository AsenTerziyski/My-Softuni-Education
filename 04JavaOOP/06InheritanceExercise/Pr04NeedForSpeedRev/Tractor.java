package demo01NeedForSpeed;

public class Tractor extends Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 50;

    public Tractor(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
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
        return super.toString();
    }
}
