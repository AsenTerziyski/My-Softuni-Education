import java.util.Scanner;

public class FL02HalfSumElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int element = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum = sum + num;
            if (element < num) {
                element = num;
            }
        }

        int diff = Math.abs(sum - element);
        // System.out.println(element);

        if (element == diff) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", element);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(element - diff));
        }

    }
}
