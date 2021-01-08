import java.util.Scanner;

public class x02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printDigitsSum(input);
    }

    private static void printDigitsSum(String inpt) {
        int sum = 0;
        for (int i = 0; i < inpt.length(); i++) {
            String digit = "" + inpt.charAt(i);
            int currentNum = Integer.parseInt(digit);
            sum = sum + currentNum;
        }
        System.out.println(sum);
    }
}
