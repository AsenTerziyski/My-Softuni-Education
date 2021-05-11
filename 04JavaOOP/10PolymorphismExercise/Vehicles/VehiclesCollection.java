package Vehicles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehiclesCollection {
    ArrayList<Vehicle> vehiclesCollection;

    public VehiclesCollection() {
        this.vehiclesCollection = new ArrayList<>();
    }

    public void addVehicle(Vehicle demoVehicle) {
        this.vehiclesCollection.add(demoVehicle);
    }

    public List<Vehicle> getVehiclesCollection() {
        if (this.vehiclesCollection.isEmpty()) {
            throw new IllegalArgumentException("Empty collection!");
        }
        return Collections.unmodifiableList(this.vehiclesCollection);
    }

    public void removeVehicle(Vehicle demoVehicle) {
        if (vehiclesCollection.isEmpty()) {
            throw new IllegalArgumentException("Empty collection!");
        } else {
            for (Vehicle vehicle : vehiclesCollection) {
                if (vehicle == demoVehicle) {
                    vehiclesCollection.remove(demoVehicle);
                } else {
                    throw new IllegalArgumentException("No such vehicle!");
                }
            }
        }

    }
}
