import java.util.Scanner;

public class Prblm02RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(factorial(n));
    }

    private static long factorial(int n) {
        // дъно:
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
