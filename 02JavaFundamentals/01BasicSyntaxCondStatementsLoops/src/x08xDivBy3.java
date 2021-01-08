import java.util.Scanner;

public class x08xDivBy3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                continue;
                //System.out.println(i);
            }
            System.out.println(i);
        }

        //Scanner scanner = new Scanner(System.in);
        //printDevisibleBy3(scanner);
    }

    private static void printDevisibleBy3(Scanner scanner) {
        int interval = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= interval; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
