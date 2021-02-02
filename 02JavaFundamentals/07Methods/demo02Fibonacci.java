import java.util.Scanner;

public class demo02Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = fibonacci(n);
        System.out.println(x);

    }

    static int fibonacci(int n) {
        // fib -------> 0 1 1 2 3 5 8 13 21 ........ -----> x = (x-1) + (x-2) ---> primerno na pozitsiya 5 = [ (5-1) = 3 ] + [ (5-2) = 2 ] => 3 + 2 = 5
        // pozitsiya    0 1 2 3 4 5 6 7  8 .........
        // razklonyava se do poznatite stoinosti 0 i 1 na pozitsii saotvetno 0 i 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
