import java.util.Scanner;

public class x05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frstName = scanner.nextLine();
        String scndName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        printConcatNames(frstName, scndName, delimiter);
    }

    private static void printConcatNames(String frstName, String scndName, String delimiter) {
        System.out.printf("%s%s%s", frstName, delimiter, scndName);
    }
}
