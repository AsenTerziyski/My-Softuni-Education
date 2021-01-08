import java.util.Scanner;

public class ME01Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int countDigit = 0;
        int countPlus = 0;
        int countMinus = 0;
        int countPoint = 0;
        int countOtherSymbols = 0;
        int countAllSymbols = 0;
        boolean isInteger = false;
        boolean isFloating = false;

        while (!input.equals("END")) {

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                if (currentChar >= '0' && currentChar <= '9') {
                    countDigit++;
                }
                if (currentChar == '+') {
                    countPlus++;
                }
                if (currentChar == '-') {
                    countMinus++;
                }
                if (currentChar == '.') {
                    countPoint++;
                }

                countOtherSymbols = input.length() - countDigit - countMinus - countPlus - countPoint;
                countAllSymbols++;
            }

            if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (countOtherSymbols == 0 && countPoint == 0 && countMinus <= 1 && countPlus <= 1 && !input.equals("") && input.charAt(0) != '0') {
                isInteger = true;
                System.out.printf("%s is integer type%n", input);
            } else if (countOtherSymbols == 0 && countPoint == 1 && countMinus <= 1 && countPlus <= 1 ) {
                isFloating = true;
                System.out.printf("%s is floating point type%n", input);
            } else if (countAllSymbols > 1) {
                System.out.printf("%s is string type%n", input);
            } else if (countAllSymbols == 1 && isInteger == false && isFloating == false) {
                System.out.printf("%s is character type%n", input);
            }

            countDigit = 0;
            countPlus = 0;
            countMinus = 0;
            countPoint = 0;
            countOtherSymbols = 0;
            countAllSymbols = 0;
            isFloating = false;
            isInteger = false;
            input = scanner.nextLine();
        }

    }
}
