import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class demo03Functions02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsStrings = scanner.nextLine().split(", ");
        Function<String, Long> longParser = s -> Long.parseLong(s);

        if (numbersAsStrings.length == 1) {
            System.out.println("Count = 1");
            System.out.println(String.format("Sum = %d", longParser.apply(numbersAsStrings[0])));

        } else {
            long sum = 0;
            for (String s : numbersAsStrings) {
                long num = longParser.apply(s);
                sum = sum + num;

            }

            System.out.println("Count = " + numbersAsStrings.length);
            System.out.println("Sum = " + sum);

        }
    }
}
