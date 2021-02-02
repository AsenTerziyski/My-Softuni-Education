import java.util.Scanner;

public class L03PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=maxLength; i++) {
            printNumbIncresingOrder(i);
        }

        for (int i = maxLength-1; i >=1; i--) {
            printNumbIncresingOrder(i);
        }

    }

    private static void printNumbIncresingOrder(int maxNumber) {
        for (int j = 1; j <=maxNumber; j++) {
            System.out.print(j);
            if (j<maxNumber) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
