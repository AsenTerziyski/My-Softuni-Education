import java.util.Scanner;

public class L10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        // sumEvens(inputNumber);
        // sumOdds(inputNumber);
        System.out.println(sumEvens(inputNumber) * sumOdds(inputNumber));
    }

    private static int sumOdds(int inputNumber) {
        int temp = inputNumber;
        int sumOdds = 0;
        while (temp != 0) {
            // Уловката ту е да е различно от нула, защото ако е > от нула
            // при отрицателно число няма да сработи.
            int lastDigit = temp % 10;
            if (lastDigit % 2 != 0) {
                sumOdds = sumOdds + lastDigit;
            }
            temp = temp / 10;
        }
        return sumOdds;
    }

    private static int sumEvens(int inputNumber) {
        int temp = inputNumber;
        int sumEven = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            if (lastDigit % 2 == 0) {
                sumEven = sumEven + lastDigit;
            }
            temp = temp / 10;
        }
        return sumEven;
    }
}
