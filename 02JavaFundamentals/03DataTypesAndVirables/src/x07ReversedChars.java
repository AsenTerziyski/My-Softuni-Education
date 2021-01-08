import java.util.Scanner;

public class x07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frst = scanner.nextLine();
        String scnd = scanner.nextLine();
        String thrd = scanner.nextLine();

        printReversedChars(frst, scnd, thrd);
    }

    private static void printReversedChars(String one, String two, String three) {
        String reversedChars = three + " " + two + " " + one + " ";
        System.out.println(reversedChars);
    }
}
