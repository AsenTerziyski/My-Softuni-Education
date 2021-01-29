import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FPLdemo01IsPrimeNumber {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int[] numbers = {13, 7, 2, 5, 25, 257};
        Arrays.stream(numbers)
                .forEach(number -> System.out.println(number + " " + isPrime(number)));
//        for (int number : numbers) {
//            System.out.println(number + " " + isPrime(number));
//        }
    }

    public static boolean isPrime(int number) {
        //number is exclusive, 2 is inclusive:
//        boolean check = IntStream
//                .range(2, number)
//                .noneMatch(n -> number % n == 0);
        boolean check = IntStream
                .range(2, number)
                .noneMatch(n -> isDivisible(number, n));
        return check && isGreaterThan(number, 1);
        // with forLoop:
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return number > 1;
    }

    public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

    public static boolean isGreaterThan(int first, int second) {
        return first > second;
    }

}
