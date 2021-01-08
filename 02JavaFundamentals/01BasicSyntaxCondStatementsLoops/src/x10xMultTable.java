import java.util.Scanner;

public class x10xMultTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        multiplicateByNumber(scanner);
    }

    private static void multiplicateByNumber(Scanner scanner) {
        int num = Integer.parseInt(scanner.nextLine());
        int multiplication = 0;
        for (int i=1; i<=10; i++) {
            multiplication = num * i;
            System.out.printf("%d X %d = %d%n", num, i, multiplication);
            multiplication = 0;
        }
    }
}
