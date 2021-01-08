import java.util.Scanner;

public class x06TriplesLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTriplesLatinLetters(n);
    }

    private static void printTriplesLatinLetters(int n) {
        for (int i = 'a'; i < 'a' + n; i++) {
            for (int j = 'a'; j < 'a' + n; j++) {
                for (int k = 'a'; k < 'a' + n; k++) {
                    char frstLttr = (char) i;
                    char scndLttr = (char) j;
                    char thrdLttr = (char) k;
                    System.out.printf("%c%c%c%n", frstLttr, scndLttr, thrdLttr);
                }
            }
        }
    }
}
