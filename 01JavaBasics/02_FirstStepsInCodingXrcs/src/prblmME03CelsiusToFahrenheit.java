import java.util.Scanner;

public class prblmME03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsiusDeg = Double.parseDouble(scanner.nextLine());
        double fahrenheitDeg = (celsiusDeg * 1.8000 + 32.000);

        System.out.printf("%.2f", fahrenheitDeg);

    }
}
