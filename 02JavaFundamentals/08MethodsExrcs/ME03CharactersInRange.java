import java.util.Scanner;

public class ME03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        printCharsInRange(first, second);
    }

    private static void printCharsInRange(char first, char second) {
        String output = "";
        if (first < second) {
            for (char i = (char) (first + 1); i < second; i++) {
                output = output + (i + " ");
            }
        } else {
            for (char i = (char) (second + 1); i < first; i++) {
                output = output + (i + " ");
            }
        }
        System.out.print(output);
    }
}
