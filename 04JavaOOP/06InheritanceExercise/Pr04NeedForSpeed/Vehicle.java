package Pr04NeedForSpeed;

public class Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    /* ako ima private predi final, nyama da e dostapna izvan klasa.
     shtom ima static => mozhe da se dostapva prez imeto na klasa s tochka , primerno v Main metoda => Vehicle.DEFAULT_FUEL_....;
    */

    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public void drive(double kilometers) {
        double remainingFuel = this.getFuel()- this.getFuelConsumption() * kilometers;
        if (remainingFuel>=0) {
            this.setFuel(remainingFuel);
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

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
