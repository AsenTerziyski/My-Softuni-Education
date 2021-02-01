package DC01CarInfo;

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
            String model = info[1];
            int horsePower = Integer.parseInt(info[2]);

            Car car = new Car(brand, model, horsePower);
            cars.add(car);

        }

        for (Car car : cars) {
            System.out.println(String.format("The car is: %s %s - %d HP.", car.brand, car.model, car.horsePower));
        }

	// write your code here
    }
}
