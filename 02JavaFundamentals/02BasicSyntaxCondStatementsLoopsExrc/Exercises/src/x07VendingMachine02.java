import java.util.Scanner;

public class x07VendingMachine02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputCoins = scanner.nextLine();
        double totalSumIncerted = 0.00;
        while (!inputCoins.equals("Start")) {
            switch (inputCoins) {
                case "0.1":
                    totalSumIncerted = totalSumIncerted + 0.10 * 100;
                    break;
                case "0.2":
                    totalSumIncerted = totalSumIncerted + 0.20 * 100;
                    break;
                case "0.5":
                    totalSumIncerted = totalSumIncerted + 0.50 * 100;
                    break;
                case "1":
                    totalSumIncerted = totalSumIncerted + 1.00 * 100;
                    break;
                case "2":
                    totalSumIncerted = totalSumIncerted + 2.00 * 100;
                    break;
                default:
                    double inputCoinsDouble = Double.parseDouble(inputCoins);
                    System.out.printf("Cannot accept %.2f%n", inputCoinsDouble);
                    break;
            }
            inputCoins = scanner.nextLine();
        }

        String inputProduct = scanner.nextLine();
        while (!inputProduct.equals("End")) {
            switch (inputProduct) {
                case "Nuts":
                    if (totalSumIncerted >= (100 * 2.00)) {
                        totalSumIncerted = totalSumIncerted - (2.00 * 100);
                        System.out.printf("Purchased %s%n", inputProduct);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (totalSumIncerted >= (100 * 0.70)) {
                        totalSumIncerted = totalSumIncerted - (0.70 * 100);
                        System.out.printf("Purchased %s%n", inputProduct);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (totalSumIncerted >= (100 * 1.50)) {
                        totalSumIncerted = totalSumIncerted - (1.50 * 100);
                        System.out.printf("Purchased %s%n", inputProduct);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (totalSumIncerted >= (100 * 0.80)) {
                        totalSumIncerted = totalSumIncerted - (0.80 * 100);
                        System.out.printf("Purchased %s%n", inputProduct);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (totalSumIncerted >= (100 * 1.00)) {
                        totalSumIncerted = totalSumIncerted - (1.00 * 100);
                        System.out.printf("Purchased %s%n", inputProduct);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            inputProduct = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", (totalSumIncerted / 100.00));
    }
}
