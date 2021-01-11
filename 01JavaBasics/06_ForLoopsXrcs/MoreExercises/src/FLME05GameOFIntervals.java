import java.util.Scanner;

public class FLME05GameOFIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double points1 = 0.00;
        int count1 = 0;

        double points2 = 0.00;
        int count2 = 0;

        double points3 = 0.00;
        int count3 = 0;

        double points4 = 0.00;
        int count4 = 0;

        double points5 = 0.00;
        int count5 = 0;

        int countTotal = 0;
        double rezult = 0.00;

        int countInvalid = 0;
        double rezultFinal = 0.00;

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());
            countTotal = countTotal + 1;

            if (number >= 0 && number <= 9) {
                points1 = 0.20 * number;
                count1 = count1 + 1;
                rezult = rezult + points1;
            }

            if (number >= 10 && number <= 19) {
                points2 = 0.30 * number;
                count2 = count2 + 1;
                rezult = rezult + points2;
            }

            if (number >= 20 && number <= 29) {
                points3 = 0.40 * number;
                count3 = count3 + 1;
                rezult = rezult + points3;
            }

            if (number >= 30 && number <= 39) {
                points4 = 50 * 1.00;
                count4 = count4 + 1;
                rezult = rezult + points4;
            }

            if (number >= 40 && number <= 50) {
                points5 = 1.00 * 100;
                count5 = count5 + 1;
                rezult = rezult + points5;
            }

            if (number < 0) {
                rezult = rezult / 2.00;
                countInvalid = countInvalid + 1;
            }

            if (number > 50) {
                rezult = rezult / 2.00;
                countInvalid = countInvalid + 1;
            }

            rezultFinal = rezult;

        }

        double p1 = 100.00 * count1 / countTotal;
        double p2 = 100.00 * count2 / countTotal;
        double p3 = 100.00 * count3 / countTotal;
        double p4 = 100.00 * count4 / countTotal;
        double p5 = 100.00 * count5 / countTotal;
        double pInvalid = 100.00 * countInvalid / countTotal;

        System.out.printf("%.2f%n", rezultFinal);
        System.out.printf("From 0 to 9: %.2f%%%n", p1);
        System.out.printf("From 10 to 19: %.2f%%%n", p2);
        System.out.printf("From 20 to 29: %.2f%%%n", p3);
        System.out.printf("From 30 to 39: %.2f%%%n", p4);
        System.out.printf("From 40 to 50: %.2f%%%n", p5);
        System.out.printf("Invalid numbers: %.2f%%", pInvalid);

    }
}
