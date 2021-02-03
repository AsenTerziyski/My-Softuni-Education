import java.util.Scanner;

public class L11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double b = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.0f", calculate(a, operator, b));
    }

    private static double calculate(double a, char operator, double b) {
        double result = 0.00;
        switch (operator) {
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
        }
        return result;
    }
}
