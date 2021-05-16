import java.util.Scanner;

public class x05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int countNegative = 0;
        int countZero = 0;

        if (num1 < 0) {
            countNegative++;
        }
        if (num2 < 0) {
            countNegative++;
        }
        if (num3 < 0) {
            countNegative++;
        }
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            countZero++;
        }

        if (countZero >= 1) {
            System.out.println("zero");
        } else if (countNegative == 2 || countNegative == 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

    }
}
