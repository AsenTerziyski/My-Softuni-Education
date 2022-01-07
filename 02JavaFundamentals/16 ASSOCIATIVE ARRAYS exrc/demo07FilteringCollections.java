import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo07FilteringCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .filter(n -> n > 1).sorted()
                .toArray();

        for (int num : nums) {
            System.out.print(num + "-");
        }

        System.out.println();
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

        List<Integer> numsList = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(n -> Integer.parseInt(n))
                .filter(n -> n > 0 && n < 100).sorted((n1, n2) -> n1.compareTo(n2) )
                .collect(Collectors.toList());

        for (int i = 0; i < numsList.size(); i++) {
            System.out.print(String.format("n = %d, ", numsList.get(i)));
        }

        System.out.println();
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");


        int sum = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .filter(n -> n > 1).sum();

        System.out.println(sum);

        double average = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(n-> Integer.parseInt(n)).average()
                .getAsDouble();
        System.out.printf("%.5f", average);

    }
}
