import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();

        int sum = Arrays.stream(numbers).sum();
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        double average = Arrays.stream(numbers).average().getAsDouble();

        System.out.println(String.format("min = %d, max = %d, sum = %d, average = %.5f", min, max, sum, average));

    }
}
