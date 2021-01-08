import java.util.Scanner;

public class x03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        double totalSpent = 0.00;
        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            double price = 0;
            switch (input) {
                case "OutFall 4":
                    if (currentBalance >= 39.99) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance = currentBalance - 39.99;
                        totalSpent = totalSpent + 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (currentBalance >= 15.99) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance = currentBalance - 15.99;
                        totalSpent = totalSpent + 15.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (currentBalance >= 19.99) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance = currentBalance - 19.99;
                        totalSpent = totalSpent + 19.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (currentBalance >= 59.99) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance = currentBalance - 59.99;
                        totalSpent = totalSpent + 59.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (currentBalance >= 29.99) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance = currentBalance - 29.99;
                        totalSpent = totalSpent + 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (currentBalance >= 39.99) {
                        System.out.printf("Bought %s%n", input);
                        currentBalance = currentBalance - 39.99;
                        totalSpent = totalSpent + 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
    }
}
