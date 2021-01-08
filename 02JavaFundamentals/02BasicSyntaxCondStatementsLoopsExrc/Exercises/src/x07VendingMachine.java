import java.util.Scanner;

public class x07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalSumIn = 0.00;
        double moneyInvalid = 0.00;

        while (!input.equals("Start")) {
            switch (input) {
                case "0.1":
                    totalSumIn = totalSumIn + 0.1 * 100;
                    break;
                case "0.2":
                    totalSumIn = totalSumIn + 0.2 * 100;
                    break;
                case "0.5":
                    totalSumIn = totalSumIn + 0.5 * 100;
                    break;
                case "1":
                    totalSumIn = totalSumIn + 1.00 * 100;
                    break;
                case "2":
                    totalSumIn = totalSumIn + 2.00 * 100;
                    break;
                default:
                    moneyInvalid = Double.parseDouble(input);
                    System.out.printf("Cannot accept %.2f%n", moneyInvalid);
            }
            input = scanner.nextLine();
        }


        String inputProduct = scanner.nextLine();
        while (!inputProduct.equals("End")) {
            switch (inputProduct) {
                case "Nuts":
                    if (totalSumIn < 200.00) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    totalSumIn = totalSumIn - 2.00 * 100;
                    System.out.printf("Purchased %s%n", inputProduct);
                    break;
                case "Water":
                    if (totalSumIn < 70.00) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    totalSumIn = totalSumIn - 0.70 * 100;
                    System.out.printf("Purchased %s%n", inputProduct);
                    break;
                case "Crisps":
                    if (totalSumIn < 150.00) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    totalSumIn = totalSumIn - 1.50 * 100;
                    System.out.printf("Purchased %s%n", inputProduct);
                    break;
                case "Soda":
                    if (totalSumIn < 80.00) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    totalSumIn = totalSumIn - 0.80 * 100;
                    System.out.printf("Purchased %s%n", inputProduct);
                    break;
                case "Coke":
                    if (totalSumIn < 100.00) {
                        System.out.printf("%nSorry, not enough money");
                        break;
                    }
                    totalSumIn = totalSumIn - 1.00 * 100;
                    System.out.printf("Purchased %s%n", inputProduct);
                    break;
                default:
                    System.out.println("Invalid product");
            }
            inputProduct = scanner.nextLine();
        }
        double change = totalSumIn/100;
        System.out.printf("Change: %.2f", change);
    }
}
