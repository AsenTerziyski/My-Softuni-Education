package Vehicles;

import java.text.DecimalFormat;

public class VehicleI implements Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    public VehicleI(double fuelQuantity, double fuelConsumption) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
    }

    protected void setFuelConsumption(double fuelConsumption) {
        if (fuelConsumption > 0) {
            this.fuelConsumption = fuelConsumption;
        } else {
            throw new IllegalArgumentException("Fuel consumption zero or negative - not valid. Please try again!");
        }
    }

    protected void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity > 0) {
            this.fuelQuantity = fuelQuantity;
        } else {
            throw new IllegalArgumentException("Fuel zero or negative. Please try again!");
        }
    }


    @Override
    public String drive(double distance) {
        double fuelConsumed = fuelConsumption * distance;
        DecimalFormat df = new DecimalFormat("#.##");
        String result = "needs refuelling";
        if (this.fuelQuantity >= fuelConsumed) {
            result = String.format("travelled %s km", df.format(distance));
            this.fuelQuantity = fuelQuantity - fuelConsumed;
            return result;
        }
        return result;
    }

    @Override
    public void refuel(double litters) {
        this.fuelQuantity = this.fuelQuantity + litters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                this.fuelQuantity);
    }
}
