import java.math.BigDecimal;
import java.util.Scanner;

public class x03BigDecimalTryWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // precisionCalc(n);
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= n; i++) {
            String inputAsString = scanner.nextLine();
            BigDecimal number = new BigDecimal(inputAsString);
            sum = sum.add(number);
        }
        System.out.print(sum);
    }

    private static void precisionCalc(int n) {
        // Ако искам да чета в метода, трябва да създам локален сканер.
        // Сканерът е променлива и като такава, тя живее само в къдравите скоби, в които е дефинирана!!!
        Scanner scanner = new Scanner(System.in);
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= n; i++) {
            String inputAsString = scanner.nextLine();
            BigDecimal number = new BigDecimal(inputAsString);
            sum = sum.add(number);
        }
        System.out.print(sum);
    }
}
