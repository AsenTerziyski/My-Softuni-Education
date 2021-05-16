import java.util.Scanner;

public class ME04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean lettersDigits = false;
        boolean digits = false;
        boolean symbols = false;

        String input = scanner.nextLine();
        symbols = (input.length() >= 6 && input.length() <= 10);
        digits = digitsInput(input);
        lettersDigits = lettersDigitsInput(input);

        if (!lettersDigits || !digits || !symbols) {

            if (!symbols) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!lettersDigits) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!digits) {
                System.out.println("Password must have at least 2 digits");
            }
        } else {
            System.out.println("Password is valid");
        }
    }

    private static boolean lettersDigitsInput(String input) {
        boolean lettersAndDigitsOnly = true;
        //int countLettersAndDigits = 0;
        int countOtherSymbols = 0;
        String lowerCase = "";
        for (int i = 0; i < input.length(); i++) {
            lowerCase = input.toLowerCase();
            char symbol = lowerCase.charAt(i);
            if ((symbol >= 'a' && symbol <= 'z') || (symbol >= '0' && symbol <= '9')) {
                //countLettersAndDigits++;
            } else {
                countOtherSymbols++;
            }
        }
        if (countOtherSymbols > 0) {
            lettersAndDigitsOnly = false;
        }
        return lettersAndDigitsOnly;
    }

//    static boolean isLetterAndisDigit(String input) {
//        boolean isLetterisDigit = false;
//        for (int i = 0; i < input.length(); i++) {
//            char symbol = input.charAt(i);
//            if (Character.isLetter(symbol) || Character.isDigit(symbol)) {
//                isLetterisDigit = true;
//            }
//        }
//        return isLetterisDigit;
//    }

    private static boolean digitsInput(String input) {
        int count = 0;
        boolean digitsMoreThanOrEqualTwo = false;
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                count = count + 1;
            }
        }
        if (count >= 2) {
            digitsMoreThanOrEqualTwo = true;
        }
        return digitsMoreThanOrEqualTwo;
    }
}
