import java.util.Scanner;

public class FL03OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0.00;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;

        double evenSum = 0.00;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum = evenSum + num;

                if (num > evenMax) {
                    evenMax = num;
                }

                if (num < evenMin) {
                    evenMin = num;
                }

            } else {
                oddSum = oddSum + num;

                if (num > oddMax) {
                    oddMax = num;
                }

                if (num < oddMin) {
                    oddMin = num;
                }

            }

        }

    }
}
