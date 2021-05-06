package demo01NeedForSpeed;

public class Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 1;
    static int ID = 0;

    private double fuelConsumption;
    private double fuel;
    private int horsePower;
    private int vehicleID;

    public Vehicle(double fuel, int horsePower) {
        this.setFuel(fuel);
        this.setHorsePower(horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
        this.vehicleID = ++ID;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    private void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(double kilometers) {
        double remainingFuel = this.fuel - this.fuelConsumption * kilometers;
        if (remainingFuel > 0) {
            this.setFuel(remainingFuel);
        } else {
            throw new IllegalArgumentException("Zero Fuel");
        }

    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    @Override
    public String toString() {
        if (vehicleID <= 9) {
            return "0" + this.vehicleID + ". " + this.getClass().getSimpleName() + " => ID" + vehicleID + " has fuel consumption: " + this.fuelConsumption
                    + " and left fuel: " + this.fuel + "litres.";
        }
        return this.vehicleID + ". " + this.getClass().getSimpleName() + " => ID" + vehicleID + " has fuel consumption: " + this.fuelConsumption
                + " and left fuel: " + this.fuel + "litres.";
    }
}
