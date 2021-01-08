import java.util.Scanner;

public class x08LowerUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lowerOrUpper = scanner.nextLine().charAt(0);
        printLowerOrUpper(lowerOrUpper);
    }

    private static void printLowerOrUpper(char chr) {
        if (chr >= 'a' && chr <= 'z') {
            System.out.println("lower-case");
        } else if (chr >= 'A' && chr <= 'Z') {
            System.out.println("upper-case");
        }
    }
}
