import java.util.Scanner;

public class FL09LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int iRight = 0;
        int iLeft = 0;
        int sumRight = 0;
        int sumLeft = 0;

        for (iRight = 1; iRight <= n; iRight++) {
            int numRight = Integer.parseInt(scanner.nextLine());
            sumRight = sumRight + numRight;
        }

        for (iLeft = 1; iLeft <= n; iLeft++) {
            int numLeft = Integer.parseInt(scanner.nextLine());
            sumLeft = sumLeft + numLeft;
        }

        int diff = Math.abs(sumLeft - sumRight);

        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", diff);
        }

    }
}
