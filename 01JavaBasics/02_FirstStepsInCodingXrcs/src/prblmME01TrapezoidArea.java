import java.util.Scanner;

public class prblmME01TrapezoidArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Да се внимава какви променливи се дефинират!!!
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double areaTrapezoid = 1.00 * (a + b) * h / 2;

        System.out.printf("%.2f", areaTrapezoid);

    }
}
