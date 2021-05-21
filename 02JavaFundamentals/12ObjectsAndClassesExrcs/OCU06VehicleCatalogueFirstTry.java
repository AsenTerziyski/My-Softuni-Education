import java.util.ArrayList;
import java.util.Scanner;

public class OCU06VehicleCatalogueFirstTry {
    public static class Truck {
        //{typeOfVehicle} {model} {color} {horsepower}
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Truck(String model, String color, int horsePower) {
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
            this.type = "Truck";
        }

        public int getHorsePower() {
            return horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %d%n", this.type,
                    this.model, this.color, this.horsePower);
        }
    }

    public static class Car {
        //{typeOfVehicle} {model} {color} {horsepower}
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Car(String model, String color, int horsePower) {
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
            this.type = "Car";
        }

        public int getHorsePower() {
            return horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %d%n", this.type,
                    this.model, this.color, this.horsePower);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Car> typeCar = new ArrayList<>();
        ArrayList<Truck> typeTruck = new ArrayList<>();

        int countCars = 0;
        int horsePowerAllCars = 0;

        int horsePowerAllTrucks = 0;
        int countTrucks = 0;


        while (!"End".equals(input)) {
            String[] inputArray = input.split("\\s+");
            String typeOfVehicle = inputArray[0];
            String model = inputArray[1];
            String color = inputArray[2];
            int horsepower = Integer.parseInt(inputArray[3]);

            switch (typeOfVehicle) {
                case "car":
                    Car currentCar = new Car(model, color, horsepower);
                    typeCar.add(currentCar);
                    countCars++;
                    horsePowerAllCars = horsePowerAllCars + currentCar.getHorsePower();
                    break;
                case "truck":
                    Truck currentTruck = new Truck(model, color, horsepower);
                    typeTruck.add(currentTruck);
                    countTrucks++;
                    horsePowerAllTrucks = horsePowerAllTrucks + currentTruck.getHorsePower();
                    break;
            }
            input = scanner.nextLine();
        }

        String inputModel = scanner.nextLine();
//        int countCars = 0;
//        int horsePowerAllCars = 0;
//
//        int horsePowerAllTrucks = 0;
//        int countTrucks = 0;

//        ArrayList<Car> carsToPrint = new ArrayList<>();
//        ArrayList<Truck> trucksToPrint = new ArrayList<>();
//        while (!"Close the Catalogue".equals(inputModel)) {
//            for (int i = 0; i < typeCar.size(); i++) {
//                if (inputModel.equals(typeCar.get(i).getModel())) {
//                    //countCars = countCars + 1;
//                    //horsePowerAllCars = horsePowerAllCars + typeCar.get(i).getHorsePower();
//                    carsToPrint.add(typeCar.get(i));
//                    break;
//                }
//            }
//            for (int i = 0; i < typeTruck.size(); i++) {
//                if (inputModel.equals(typeTruck.get(i).getModel())) {
//                    //countTrucks = countTrucks + 1;
//                    //horsePowerAllTrucks = horsePowerAllTrucks + typeTruck.get(i).getHorsePower();
//                    trucksToPrint.add(typeTruck.get(i));
//                    break;
//                }
//            }
//            inputModel = scanner.nextLine();
//        }
//
//        for (int i = 0; i < carsToPrint.size(); i++) {
//            System.out.print(carsToPrint.get(i));
//        }
//
//        //System.out.println();
//        for (int i = 0; i < trucksToPrint.size(); i++) {
//            System.out.print(trucksToPrint.get(i));
//        }
        while (!"Close the Catalogue".equals(inputModel)) {

            for (Car car : typeCar) {
                if (car.getModel().equals(inputModel)) {
                    System.out.print(car);
                    break;
                }
            }

            for (Truck truck : typeTruck) {
                if (truck.getModel().equals(inputModel)) {
                    System.out.print(truck);
                    break;
                }
            }

            inputModel = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", 1.00 * horsePowerAllCars / countCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", 1.00 * horsePowerAllTrucks / countTrucks);
    }
}
