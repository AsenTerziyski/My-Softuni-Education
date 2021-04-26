import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class demo07BiFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BiFunction<Double, Double, Double> rectangleArea = (a,b) -> a*b;
        Function<Double, Double> squareArea = a -> a*a;
        Function<String, Double> doubleParser = Double::parseDouble;

        String[] input = scanner.nextLine().split("\\s+");

        if (input.length == 1) {
            System.out.println(squareArea.apply(doubleParser.apply(input[0])));

        } else if (input.length == 2) {
            double a = doubleParser.apply(input[0]);
            double b = doubleParser.apply(input[1]);
            System.out.println(rectangleArea.apply(a,b));

        } else {
            throw new IllegalArgumentException("Input is not valid!");

        }
    }
}
