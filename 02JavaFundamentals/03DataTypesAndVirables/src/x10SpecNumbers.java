import java.util.Scanner;

public class x10SpecNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        printSpecialNums(input);
    }

    private static void printSpecialNums(int input) {
        String trueOrSpecial = "";
        int sumDigits = 0;
        for (int i = 1; i <= input; i++) {
            int currentNum = i;
            while (currentNum > 0) {
                int lastDigit = currentNum % 10;
                sumDigits = sumDigits + lastDigit;
                currentNum = currentNum / 10;
            }
            if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11) {
                trueOrSpecial = "True";
            } else {
                trueOrSpecial = "False";
            }
            sumDigits = 0;
            System.out.printf("%d -> %s%n", i, trueOrSpecial);
        }
    }
}
