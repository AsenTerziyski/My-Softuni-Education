import java.util.Scanner;

public class xxxDemoDigitsToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        printNumDigInWords(number);

    }

    private static void printNumDigInWords(String number) {
        String numberDigitsInWords = "";

        for (int i = number.length() - 1; i > -1; i--) {
            char symbol = number.charAt(i);
            String currentWord = "";

            switch (symbol) {
                case '0':
                    currentWord = "Zero";
                    break;
                case '1':
                    currentWord = "One";
                    break;
                case '2':
                    currentWord = "Two";
                    break;
                case '3':
                    currentWord = "Three";
                    break;
                case '4':
                    currentWord = "Four";
                    break;
                case '5':
                    currentWord = "Five";
                    break;
                case '6':
                    currentWord = "Six";
                    break;
                case '7':
                    currentWord = "Seven";
                    break;
                case '8':
                    currentWord = "Eight";
                    break;
                case '9':
                    currentWord = "Nine";
                    break;
            }

            numberDigitsInWords = numberDigitsInWords + currentWord;

        }

        System.out.println(numberDigitsInWords);

    }
}
