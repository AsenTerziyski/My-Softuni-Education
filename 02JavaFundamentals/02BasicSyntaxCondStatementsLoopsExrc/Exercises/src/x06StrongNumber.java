import java.util.Scanner;

public class x06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int currentNum = number;
        // int lastDigit = 0;
        int sumFactorialDigits = 0;

        while (currentNum > 0) {
            int lastDigit = currentNum % 10;
            int factorial = 1;
            for (int i = lastDigit; i >= 1; i--) {
                factorial = factorial * i;
            }
            if (lastDigit == 0) {
                factorial = 1;
            }
            sumFactorialDigits = sumFactorialDigits + factorial;
            currentNum = currentNum / 10;
        }
        if (sumFactorialDigits == number){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
