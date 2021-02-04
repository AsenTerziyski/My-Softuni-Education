package dc04RawData;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Car> carsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];

            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engineObj = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargoObj = new Cargo(cargoWeight, cargoType);

            Tier[] tiers = new Tier[4];
            int count = 0;
            for (int j = 5; j < tokens.length; j += 2) {
                double tierPressure = Double.parseDouble(tokens[j]);
                int tierAge = Integer.parseInt(tokens[j + 1]);
                tiers[count] = new Tier(tierPressure, tierAge);
                count++;
            }

            Car carObj = new Car(model, engineObj, cargoObj, tiers);
            carsMap.putIfAbsent(model, carObj);
        }

        String cargoType = scanner.nextLine();

        for (Car car : carsMap.values()) {

            if (cargoType.equalsIgnoreCase("flamable")
                    && car.getCargo().getType().equalsIgnoreCase("flamable")
                    && car.getEngine().getEnginePower() > 250) {
                System.out.println(car);

            } else if (cargoType.equalsIgnoreCase("fragile")
                    && car.getCargo().getType().equalsIgnoreCase("Fragile")
                    && car.hasTireWithPressureLessThanOne()) {
                System.out.println(car);
            }

        }
    }
}
