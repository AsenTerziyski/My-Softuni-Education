import java.util.Scanner;

public class x06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frstChar = scanner.nextLine();
        String scndChar = scanner.nextLine();
        String thrdChar = scanner.nextLine();

        printCharsToString(frstChar, scndChar, thrdChar);
    }

    private static void printCharsToString(String frstChar, String scndChar, String thrdChar) {
        String comonString = frstChar + scndChar + thrdChar;
        System.out.println(comonString);
    }
}
