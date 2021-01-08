import java.util.Scanner;

public class x11xMultTable02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int i = Integer.parseInt(scanner.nextLine());
        int multipl = 0;
        do {
            multipl = i * num;
            System.out.printf("%d X %d = %d%n", num, i, multipl);
            i++;
            multipl = 0;
        } while (i<=10);
    }
}
