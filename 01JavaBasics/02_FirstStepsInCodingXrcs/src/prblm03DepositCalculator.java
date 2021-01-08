import java.util.Scanner;

public class prblm03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int timeDeposit = Integer.parseInt(scanner.nextLine());
        double annR = Double.parseDouble(scanner.nextLine());
        double monthR = annR / 12;
        double totalSum = 0;

        if (depositSum >= 100 && depositSum <= 10000 && timeDeposit > 0 && timeDeposit <= 12 && annR >= 0 && annR <= 100) {
            totalSum = depositSum + (depositSum * timeDeposit * monthR) / 100;
        }
        System.out.printf("%.2f", totalSum);
    }

}
