import java.util.Scanner;

public class FL05DevideWithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int count1=0;
        double p1=0.00;

        int count2=0;
        double p2=0.00;

        int count3=0;
        double p3=0.00;

        for (int i=1; i<=n; i++) {

            int value = Integer.parseInt(scanner.nextLine());

            if (value%2==0) {
                count1++;
            }

            if (value%3==0){
                count2++;
            }

            if (value%4==0){
                count3++;
            }

        }

        p1 = 100.00 * count1 / n;
        p2 = 100.00 * count2 / n;
        p3 = 100.00 * count3 / n;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);

    }
}
