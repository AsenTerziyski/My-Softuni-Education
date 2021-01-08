import java.util.Scanner;

public class ME01FindDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        int countDigit = 0;
        int countPlusMinus = 0;
        int countOtherSymbols = 0;
        int countPoint = 0;
        boolean isDouble = true;
        char symbol;

        for (int i = 0; i < inputText.length(); i++) {
            symbol = inputText.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                countDigit = countDigit + 1;
            } else if (symbol == '+' || symbol == '-' || symbol == '.') {
                countPlusMinus = countPlusMinus + 1;
            } else if (symbol == '.') {
                countPoint++;
            } else {
                countOtherSymbols++;
            }

        }
        for (int i = 1; i < inputText.length(); i++) {
            symbol = inputText.charAt(i);
            if (symbol == '+' || symbol == '-') {
                isDouble = false;
            }
        }
        if (countOtherSymbols > 0) {
            isDouble = false;
        }
        if (countPlusMinus > 1) {
            isDouble = false;
        }
        if (countPoint > 1) {
            isDouble = false;
        }
        if (isDouble) {
            System.out.println(isDouble);
        } else {
            System.out.println(isDouble);
        }

    }
}
