package Vehicles;

public class VehicleCollectionPrinter {

    static void printVehicles (VehiclesCollection collection) {
        if (!collection.vehiclesCollection.isEmpty()) {
            collection.getVehiclesCollection().forEach(System.out::println);
        } else {
            throw new IllegalArgumentException("Empty collection!");
        }
    }
}
