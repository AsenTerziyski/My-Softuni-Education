import java.util.Scanner;

public class x13xRefactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = 2 * i + 1;
            System.out.print(num);
            System.out.println();
            sum = sum + num;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
