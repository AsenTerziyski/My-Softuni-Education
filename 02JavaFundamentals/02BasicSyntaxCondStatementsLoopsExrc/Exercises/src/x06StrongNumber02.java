import java.util.Scanner;

public class x06StrongNumber02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - '0';
            int factorial = 1;
            for (int j = num; j >= 1; j--) {
                factorial = factorial * j;
            }
            if (num == 0) {
                factorial = 1;
            }
            sum = sum + factorial;
        }

        int num = Integer.parseInt(input);
        if (sum == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
