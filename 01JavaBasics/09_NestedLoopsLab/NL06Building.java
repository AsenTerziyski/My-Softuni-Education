import java.util.Scanner;

public class NL06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());
        int room = Integer.parseInt(scanner.nextLine());

        int fl = 0;
        int rm = 0;
        for (fl = floor; fl >= 1; fl--) {

            for (rm = 0; rm < room; rm++) {

                if (fl == floor) {
                    System.out.printf("L%d%d ", fl, rm);
                } else if (fl % 2 == 0) {
                    System.out.printf("O%d%d ", fl, rm);
                } else if (fl % 2 == 1) {
                    System.out.printf("A%d%d ", fl, rm);
                }

            }

            System.out.println();
        }
    }
}
