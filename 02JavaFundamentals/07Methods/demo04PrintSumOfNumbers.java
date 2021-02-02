import java.util.Scanner;

public class demo04PrintSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(getSum(n));
    }

    private static int getSum(int n) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumber;
        }
        return sum;
    }
}
