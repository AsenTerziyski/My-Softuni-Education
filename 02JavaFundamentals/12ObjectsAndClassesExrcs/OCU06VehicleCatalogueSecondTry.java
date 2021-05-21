import java.util.ArrayList;
import java.util.Scanner;

public class OCU06VehicleCatalogueSecondTry {
    public static class TruckSecond {
        //{typeOfVehicle} {model} {color} {horsepower}
        String typeOfVehicle;
        String model;
        String color;
        int horsepower;

        public TruckSecond(String model, String color, int horsepower) {
            this.typeOfVehicle = "Truck";
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %d%n", this.typeOfVehicle,
                    this.model, this.color, this.horsepower);
        }
    }

    public static class CarSecond {
        //{typeOfVehicle} {model} {color} {horsepower}
        String typeOfVehicle;
        String model;
        String color;
        int horsepower;

        public CarSecond(String model, String color, int horsepower) {
            this.typeOfVehicle = "Car";
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %d%n", this.typeOfVehicle,
                    this.model, this.color, this.horsepower);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CarSecond> carsCatalogue = new ArrayList<>();
        ArrayList<TruckSecond> trucksCatalogue = new ArrayList<>();

        int sumCarHorsePowers = 0;
        int sumTruckHorsePowers = 0;
        //{typeOfVehicle} {model} {color} {horsepower}
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] inputArray = input.split("\\s+");
            String typeVehicle = inputArray[0];
            String modelVehicle = inputArray[1];
            String colorVehicle = inputArray[2];
            int horsePowerVehicle = Integer.parseInt(inputArray[3]);
            switch (typeVehicle) {
                case "car":
                    CarSecond currentCar = new CarSecond(modelVehicle, colorVehicle, horsePowerVehicle);
                    carsCatalogue.add(currentCar);
                    sumCarHorsePowers = sumCarHorsePowers + currentCar.getHorsepower();
                    break;
                case "truck":
                    TruckSecond currentTruck = new TruckSecond(modelVehicle, colorVehicle, horsePowerVehicle);
                    trucksCatalogue.add(currentTruck);
                    sumTruckHorsePowers = sumTruckHorsePowers + currentTruck.getHorsepower();
                    break;
            }
            input = scanner.nextLine();
        }

        String inputModel = scanner.nextLine();
        while (!"Close the Catalogue".equals(inputModel)) {

            for (int i = 0; i < carsCatalogue.size(); i++) {
                if (inputModel.equals(carsCatalogue.get(i).getModel())) {
                    System.out.print(carsCatalogue.get(i));
                }
            }

            for (int i = 0; i < trucksCatalogue.size(); i++) {
                if (inputModel.equals(trucksCatalogue.get(i).getModel())) {
                    System.out.print(trucksCatalogue.get(i));
                }
            }

            inputModel = scanner.nextLine();
        }

        double avgHorsepowerCars = 0.0;
        if (carsCatalogue.size() != 0) {
            avgHorsepowerCars = 1.00 * sumCarHorsePowers / carsCatalogue.size();
        }
        double avgHorsepowerTrucks = 0.0;
        if (trucksCatalogue.size() !=0) {
            avgHorsepowerTrucks = 1.00 * sumTruckHorsePowers / trucksCatalogue.size();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", avgHorsepowerCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", avgHorsepowerTrucks);

    }
}
