import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FPL02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //IntStream numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(n -> Integer.parseInt(n));
        //long numCount = numbers.count();
        // ще затвори потока след нъмКаунт и ще даде грешка на сум:
        //int sum = numbers.sum();
        String inputLine = scanner.nextLine();

        Function<String, IntStream> getIntStream = str->
                Arrays
                        .stream(str.split(", "))
                        .mapToInt(Integer::parseInt);

        Function<String, Long> countFunction = str ->
        {
            long countNumbers = getIntStream.apply(str).count();
            return countNumbers;
        };

        Function<String, Integer> sumFunction = str ->
        {
//            int sumNumbers = Arrays.stream(str.split(", ")).mapToInt(Integer::parseInt).sum();
//            return sumNumbers;
            return getIntStream.apply(str).sum();

        };

        long numCount = countFunction.apply(inputLine);
        int sum = sumFunction.apply(inputLine);

        System.out.println("Count = " + numCount);
        System.out.println("Sum = " + sum);

    }
}
