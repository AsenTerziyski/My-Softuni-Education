import java.util.Scanner;

public class FLME06Bills {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());
        double electricity = 0.00;
        double water = 0.00;
        double internet = 0.00;
        double other = 0.00;
        int countMonths=0;

        for (int i = 1; i <= month; i++) {

            double electricityPerMonth = Double.parseDouble(scanner.nextLine());
            countMonths++;
            electricity = electricity + electricityPerMonth;
            water = water +20;
            internet = internet +15;
            other = 1.20*(electricity + water + internet);
        }

        double sumTotal = electricity + water + internet + other;
        double average = sumTotal / countMonths;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv", average);

    }
}
