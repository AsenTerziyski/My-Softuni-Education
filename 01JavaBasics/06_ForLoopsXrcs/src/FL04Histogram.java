import java.util.Scanner;

public class FL04Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0.00;
        int count1 = 0;

        double p2 = 0.00;
        int count2 = 0;

        double p3 = 0.00;
        int count3 = 0;

        double p4 = 0.00;
        int count4 = 0;

        double p5 = 0.00;
        int count5 = 0;

        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(scanner.nextLine());

            if (value < 200) {
                count1++;
            }

            if (value >= 200 && value <= 399) {
                count2++;
            }

            if (value >= 400 && value <= 599) {
                count3++;
            }

            if (value >= 600 && value <= 799) {
                count4++;
            }

            if (value >= 800) {
                count5++;
            }

        }

        p1 = 100.00 * count1 / n;
        p2 = 100.00 * count2 / n;
        p3 = 100.00 * count3 / n;
        p4 = 100.00 * count4 / n;
        p5 = 100.00 * count5 / n;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
