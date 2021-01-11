import java.util.Scanner;

public class FLME01BackToThePast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double heiritageMoney = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double sumToSpendEven = 0.00;
        double sumToSpendOdd = 0.00;
        int countYears = 0;

        for (int i = 1800; i <= year; i++) {

            countYears++;

            if (i % 2 == 0) {
                sumToSpendEven = sumToSpendEven + 1.00 * 12000;
            } else {
                sumToSpendOdd = sumToSpendOdd + 12000 * 1.00 + 1.00 * 50 * (countYears - 1 + 18);
            }

        }

        double sumSpended = sumToSpendEven + sumToSpendOdd;
        double diff = Math.abs(heiritageMoney - sumSpended);

        if (heiritageMoney >= sumSpended) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }

    }
}
