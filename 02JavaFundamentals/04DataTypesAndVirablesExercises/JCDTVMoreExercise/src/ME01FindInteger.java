import java.util.Scanner;

public class ME01FindInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        int countDigit = 0;
        int countPlusMinus = 0;
        int countOtherSymbols = 0;
        boolean isInteger = true;
        char symbol;

        for (int i = 0; i < inputText.length(); i++) {
            symbol = inputText.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                countDigit = countDigit + 1;
            } else if (symbol == '+' || symbol == '-') {
                countPlusMinus = countPlusMinus + 1;
            } else {
                countOtherSymbols++;
            }
        }

        for (int i = 1; i < inputText.length(); i++) {
            symbol = inputText.charAt(i);
            if (symbol == '+' || symbol == '-') {
                isInteger = false;
            }
        }

        if (countOtherSymbols > 0) {
            isInteger = false;
        }
        if (countPlusMinus > 1) {
            isInteger = false;
        }
        if (inputText.charAt(0) == '0') {
            isInteger = false;
        }
        if (isInteger) {
            System.out.println(isInteger);
        } else {
            System.out.println(isInteger);
        }

    }
}
