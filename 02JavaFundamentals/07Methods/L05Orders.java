import java.sql.SQLOutput;
import java.util.Scanner;

public class L05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", orderTotalSum(product,quantity));
    }

    private static double orderTotalSum(String product, int q) {
        double totalSum = 0.00;
        switch (product) {
            case "coffee":
                totalSum = 1.50 * q;
                break;
            case "water":
                totalSum = 1.00 * q;
                break;
            case "coke":
                totalSum = 1.40 * q;
                break;
            case "snacks":
                totalSum = 2.00 * q;
                break;
        }
        return totalSum;
    }
}