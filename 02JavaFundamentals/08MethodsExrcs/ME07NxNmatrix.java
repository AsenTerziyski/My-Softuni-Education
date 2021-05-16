import java.util.Scanner;

public class ME07NxNmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(n);
        }
    }

    private static void printLine(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(n + "");
            } else {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
