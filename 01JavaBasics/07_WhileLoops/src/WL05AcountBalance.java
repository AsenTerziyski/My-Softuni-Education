import java.util.Scanner;

public class WL05AcountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        double totalSum = 0;

        while (!inputText.equals("NoMoreMoney")) {
            double currentSum = Double.parseDouble(inputText);

            if (currentSum < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", currentSum);
            totalSum = totalSum + currentSum;
            inputText = scanner.nextLine();

        }

        System.out.printf("Total: %.2f", totalSum);

    }
}
