package Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehiclesCollection vehiclesCollection = new VehiclesCollection();
        Vehicle demoVehicle1 = new Car(100, 1);
        System.out.println(demoVehicle1.drive(50));
        demoVehicle1.refuel(10);

        Vehicle demoVehicle2 = new Truck(200, 2);
        System.out.println(demoVehicle2.drive(50));
        demoVehicle2.refuel(75);

        vehiclesCollection.addVehicle(demoVehicle1);
        vehiclesCollection.addVehicle(demoVehicle2);

        vehiclesCollection.removeVehicle(demoVehicle1);
        Vehicle demoVehicle3 = new Car(250, 2);
        vehiclesCollection.addVehicle(demoVehicle3);
        VehicleCollectionPrinter.printVehicles(vehiclesCollection);
        Vehicle demoVehicle4 = new Car(100000, 100000);
        vehiclesCollection.removeVehicle(demoVehicle4);

    }
}
