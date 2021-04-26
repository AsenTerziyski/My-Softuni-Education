import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class demo04ConsumerPredicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> printString = msg -> System.out.print(msg);

        Consumer<Double> printDouble = n -> System.out.println(String.format("%.2f", n));
        Function<Integer, Double> circleArea = r -> Math.PI * Math.pow(r, 2);
        Predicate<Double> ifAreaBiggerThan5 = d -> d > 5;

        double area = circleArea.apply(2);
        printString.accept("Area is: ");
        printDouble.accept(area);
        printString.accept("Area is bigger than 5m2: ");
        System.out.print(ifAreaBiggerThan5.test(area));

    }
}
