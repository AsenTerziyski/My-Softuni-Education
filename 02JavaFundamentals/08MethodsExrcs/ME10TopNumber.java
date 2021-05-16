import java.util.Scanner;

public class ME10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTopInteger(n);
    }

    private static void printTopInteger(int n) {
        int sum = 0;
        int countOddDigits = 0;
        for (int i = 1; i <=n; i++) {
            int a = i;
            while (a >= 1) {
                int lastDigit = a % 10;
                if (lastDigit % 2 != 0) {
                    countOddDigits++;
                }
                sum = sum + lastDigit;
                a = a / 10;
            }
            if (countOddDigits >= 1 && sum % 8 == 0) {
                System.out.println(i);
            }
            countOddDigits=0;
            sum=0;
        }
    }
}
