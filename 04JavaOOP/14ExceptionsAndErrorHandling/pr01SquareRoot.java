import java.util.Scanner;

public class pr01SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());
            double squareRoot = Math.sqrt(number);
            System.out.println(squareRoot);

        } catch (NumberFormatException ignored) {
            System.out.println("Invalid number");

        } finally {
            System.out.println("Good buy");

        }
    }
}
