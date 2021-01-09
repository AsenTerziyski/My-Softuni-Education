import java.util.Scanner;

public class ME04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double totalPrice = 0;

        if (dayOrNight.equals("day")) {
            if (n >= 100) {
                totalPrice = n * 0.06;
            }
            if (n < 20) {
                totalPrice = 0.70 + n * 0.79;
            }
            if (n >= 20 && n < 100) {
                totalPrice = 0.09 * n;
            }
            System.out.printf("%.2f", totalPrice);
        }

        if (dayOrNight.equals("night")) {
            if (n >= 100) {
                totalPrice = n * 0.06;
            }
            if (n < 20) {
                totalPrice = 0.70 + n * 0.9;
            }
            if (n >= 20 && n < 100) {
                totalPrice = 0.09 * n;
            }
            System.out.printf("%.2f", totalPrice);
        }
    }
}
