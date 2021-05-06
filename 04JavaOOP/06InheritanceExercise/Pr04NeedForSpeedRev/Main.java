package demo01NeedForSpeed;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("VEHICLE");
        Vehicle vehicle1 = new Vehicle(200, 50);
        vehicle1.drive(100);
        System.out.println(vehicle1.getFuel());
        System.out.println(vehicle1.getVehicleID());
        System.out.println(vehicle1.getHorsePower());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("CAR");
        Vehicle car2 = new Car(200, 100, "Yellow");
        car2.drive(10);
        System.out.println(car2.getFuel());
        System.out.println(car2.getVehicleID());
        System.out.println(car2.getHorsePower());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("TRACTOR");
        Vehicle tractor3 = new Tractor(70000, 400);
        tractor3.drive(20);
        System.out.println(tractor3.getFuel());
        System.out.println(tractor3.getVehicleID());
        System.out.println(tractor3.getHorsePower());
        Vehicle car4 = new Car(400, 400, "Green");
        SportCar sportCar5 = new SportCar(1000, 1000, "BLACK");

        VehicleCollection vehicleCollection = new VehicleCollection();
        vehicleCollection.addVehicle(vehicle1);
        vehicleCollection.addVehicle(car2);
        vehicleCollection.addVehicle(tractor3);
        vehicleCollection.addVehicle(car4);
        sportCar5.drive(100);
        vehicleCollection.addVehicle(sportCar5);

        SportCar sportCar6 = new SportCar(1000, 1000, "NO COLOR");
        SportCar sportCar7 = new SportCar(1000, 1000, "NO COLOR");
        SportCar sportCar8 = new SportCar(1000, 1000, "NO COLOR");
        SportCar sportCar9 = new SportCar(1000, 1000, "NO COLOR");
        SportCar sportCar10 = new SportCar(1000, 1000, "NO COLOR");
        SportCar sportCar11= new SportCar(1000, 1000, "NO COLOR");

        vehicleCollection.addVehicle(sportCar5);
        vehicleCollection.addVehicle(sportCar6);
        vehicleCollection.addVehicle(sportCar7);
        vehicleCollection.addVehicle(sportCar9);
        vehicleCollection.addVehicle(sportCar10);
        vehicleCollection.addVehicle(sportCar11);


        //vehicleCollection.removeVehicle();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        Collection<Vehicle> list = vehicleCollection.getList();
//        for (VehicleTwo v : list) {
//            int vehicleID = v.getVehicleID();
//            System.out.print(vehicleID);
//            double fuelConsumption = v.getFuelConsumption();
//            System.out.print(" => fuelConsumption: " + fuelConsumption);
//            System.out.println();
//        }

        for (Vehicle v : list) {
            System.out.println(v);
        }

    }

}
