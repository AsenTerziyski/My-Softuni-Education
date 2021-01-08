import java.util.Scanner;

public class ME02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine());
        long tempLeft = 0;
        long tempRight = 0;

        for (long i = 1; i <= n; i++) {

            long inputLeft = scanner.nextLong();
            tempLeft = inputLeft;
            long inputRight = scanner.nextLong();
            tempRight = inputRight;

            if (tempLeft > tempRight) {
                printSumDigits(tempLeft);
            } else {
                printSumDigits(tempRight);
            }

        }

    }

    private static void printSumDigits(long num) {
        long currentNum = num;
        long sum = 0;

        while (currentNum > 0) {
            long lastDigit = currentNum % 10;
            sum = sum + lastDigit;
            currentNum = currentNum / 10;
            lastDigit = 0;
        }

        System.out.println(sum);
    }
}
