import java.util.Scanner;

public class ME03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        printFloatingEquality(a,b);

    }

    private static void printFloatingEquality(double a, double b) {

        double diff = Math.abs(a - b);
        final double eps = 0.000001;

        if (diff > eps) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }
}
