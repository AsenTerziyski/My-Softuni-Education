package DC02CarConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String inputInfo = scanner.nextLine();
            String[] info = inputInfo.split("\\s+");

            String brand = info[0];
            Car car = new Car(brand);

            if (info.length == 1) {
                car.setBrand(brand);
            }

            if (info.length >= 2) {
                car.setModel(info[1]);
            }

            if (info.length == 3) {
                car.setHorsePower(Integer.parseInt(info[2]));
            }

            cars.add(car);

        }

        for (Car car : cars) {
            System.out.println(String.format("The car is: %s %s - %d HP.", car.brand, car.model, car.horsePower));
        }

        // write your code here
    }
}
