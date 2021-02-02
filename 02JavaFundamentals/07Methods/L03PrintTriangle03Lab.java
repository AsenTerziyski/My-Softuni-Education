import java.util.Scanner;

public class L03PrintTriangle03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //int start = Integer.parseInt(scanner.nextLine());
        // int end = Integer.parseInt(scanner.nextLine());
        printTriangle(n);

    }

    private static void printTriangle(int n) {
        for (int line = 1; line <=n; line++) {
            prinLine(1,line);
        }

        for (int line = n-1; line >=1; line--) {
            prinLine(1,line);
        }
    }

    private static void prinLine(int start, int end) {
        for (int i = start; i <=end; i++) {
            System.out.print(i);
            if (i<end) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
