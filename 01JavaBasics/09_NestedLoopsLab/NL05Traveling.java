import java.util.Scanner;

public class NL05Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dest = scanner.nextLine();
        double savedMoney = 0.00;

        while (!dest.equals("End")) {

            double minBudget = Double.parseDouble(scanner.nextLine());

            while ((savedMoney - minBudget) < 0.00) {
                double currentMoney = Double.parseDouble(scanner.nextLine());
                savedMoney = savedMoney + currentMoney;
            }

            System.out.printf("Going to %s!%n", dest);
            savedMoney = 0.00;

            dest = scanner.nextLine();

        }
    }
}
