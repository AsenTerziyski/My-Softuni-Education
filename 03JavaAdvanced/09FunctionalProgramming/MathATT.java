import java.util.stream.IntStream;

public class MathATT {

    public static boolean isPrime(int number) {
        boolean check = IntStream
                .range(2, number)
                .noneMatch(n -> isDivisible(number, n));
        return check && isGreaterThan(number, 1);
    }

    public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

    public static boolean isEven(int number) {
        return isDivisible(number, 2);
    }

    public static boolean isGreaterThan(int first, int second) {
        return first > second;
    }
}
