package Vehicles;

public class Truck extends VehicleI {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + 1.6);
    }

    @Override
    protected void setFuelQuantity(double fuelQuantity) {
        super.setFuelQuantity(fuelQuantity);
    }

    @Override
    public String drive(double distance) {
        return "Truck " + super.drive(distance);
    }

    @Override
    public void refuel(double litters) {
        super.refuel(litters + 2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
