package demo01NeedForSpeed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class VehicleCollection {
    ArrayList<Vehicle> list;

    public VehicleCollection() {
        this.list = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.list.add(vehicle);
    }

    public Vehicle removeVehicle() {
        if (!this.list.isEmpty()) {
            Vehicle removedVehicle = this.list.get(this.list.size() - 1);
            this.list.remove(this.list.size() - 1);
            return removedVehicle;
        }
        return null;
    }

    public Collection<Vehicle> getList() {
        Collection<Vehicle> vehicles = Collections.unmodifiableCollection(this.list);
        return vehicles;
    }
}
