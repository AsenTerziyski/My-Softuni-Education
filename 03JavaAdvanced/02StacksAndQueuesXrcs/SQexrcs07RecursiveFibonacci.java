import java.util.Scanner;

public class SQexrcs07RecursiveFibonacci {

    private static long[] memory;
    //private static long count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        memory = new long[n + 1];
        long result = fibonnaci(n);
        //System.out.println(count);
        System.out.println(result);


    }

    private static long fibonnaci(int n) {
        //count++;
        if (n < 2) {
            return 1;
        }

        if (memory[n] != 0) {
            return memory[n];
        }

        return memory[n] = fibonnaci(n - 1) + fibonnaci(n - 2);
    }
}
