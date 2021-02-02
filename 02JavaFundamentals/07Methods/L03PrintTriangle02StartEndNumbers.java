import java.util.Scanner;

public class L03PrintTriangle02StartEndNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <=endNum; i++) {
            printNumIncreasingOrder(i);
        }

        for (int i = endNum-1; i >=startNum; i--) {
            printNumIncreasingOrder(i);

        }

    }

    private static void printNumIncreasingOrder(int maxNum) {
        for (int i = 1; i <=maxNum; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
