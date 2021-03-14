package Pr01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicle = tokens[1];
            double distanceOrLitters = Double.parseDouble(tokens[2]);

            switch (command) {
                case "Drive":
                    switch (vehicle) {
                        case "Car":
                            System.out.println(car.drive(distanceOrLitters));
                            break;
                        case "Truck":
                            System.out.println(truck.drive(distanceOrLitters));
                            break;
                    }
                    break;

                case "Refuel":
                    switch (vehicle) {
                        case "Car":
                            car.refuel(distanceOrLitters);
                            break;
                        case "Truck":
                            truck.refuel(distanceOrLitters);
                            break;
                    }
                    break;
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
    }
}
