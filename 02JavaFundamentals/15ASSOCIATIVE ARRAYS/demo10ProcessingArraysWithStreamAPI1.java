import java.util.Arrays;
import java.util.Scanner;

public class demo10ProcessingArraysWithStreamAPI1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(s-> Integer.parseInt(s)).toArray();
        int min = Arrays.stream(num).min().getAsInt();
        int max = Arrays.stream(num).max().getAsInt();
        int sum = Arrays.stream(num).sum();
        double average = Arrays.stream(num).average().getAsDouble();

        System.out.println(Arrays.stream(num).min().getAsInt());
        System.out.println(Arrays.stream(num).max().getAsInt());
        System.out.println(Arrays.stream(num).sum());
        System.out.println(String.format("%.5f", average));

    }
}
