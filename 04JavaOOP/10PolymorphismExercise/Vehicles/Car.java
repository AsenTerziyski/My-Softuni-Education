package Vehicles;

public class Car extends VehicleI {
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + 1);
    }

    @Override
    protected void setFuelQuantity(double fuelQuantity) {
        super.setFuelQuantity(fuelQuantity);
    }

    @Override
    public String drive(double distance) {
        return "Car " + super.drive(distance);
    }

    @Override
    public void refuel(double litters) {
        super.refuel(litters);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
