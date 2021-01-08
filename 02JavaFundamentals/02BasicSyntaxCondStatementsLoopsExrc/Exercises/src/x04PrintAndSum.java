import java.util.Scanner;

public class x04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        printItervalFromStartToEndAndSumDigitis(start, end);
    }

    private static void printItervalFromStartToEndAndSumDigitis(int start, int end) {
        int sum = 0;
        for (int i = start; i <=end ; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
