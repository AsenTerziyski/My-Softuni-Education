import java.util.Scanner;

public class x01MetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());
        printMetersInKilometers(meters);

    }

    private static void printMetersInKilometers(int m) {
        double km = m / 1000.00;
        System.out.printf("%.2f", km);
    }
}
