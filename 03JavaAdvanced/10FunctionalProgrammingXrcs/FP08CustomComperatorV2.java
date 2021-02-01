import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FP08CustomComperatorV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Comparator<Integer> customComparator = (num1, num2) -> {
            // num1 - even, num2 - even
            // num1 - odd, num2 - even
            // num1 - odd, num2 - even
            // both are odd
            if (num1 % 2 == 0 && num2 % 2 != 0) {
                // not swap
                return -1;
            } else if (num1 % 2 != 0 && num2 % 2 == 0) {
                // swap
                return 1;
            }
            return num1.compareTo(num2);
        };

        numbers
                .stream()
                .sorted(customComparator)
                .forEach(e -> System.out.print(e + " "));

    }
}
