import java.util.Scanner;

public class x02PoundsDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollars = Double.parseDouble(scanner.nextLine());
        printPoundsInDollars(dollars);
    }

    private static void printPoundsInDollars(double $) {
        double pounds = $ * 1.31;
        System.out.printf("%.3f", pounds);
    }
}
