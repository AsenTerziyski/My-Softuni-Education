import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //System.out.println();
        numbers = numbers
                .stream()
                .sorted((first, second) -> first.compareTo(second))
                .collect(Collectors.toList());
        //System.out.println();

        Function<List<Integer>, List<Integer>> sortedNumbers = list -> {
            List<Integer> outputList = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    outputList.add(list.get(i));
                }
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 != 0) {
                    outputList.add(list.get(i));
                }
            }
            return outputList;
        };

        numbers = sortedNumbers.apply(numbers);
        //Consumer<List<Integer>> printList = list -> System.out.print(list + " ");
        numbers.stream().forEach(el -> System.out.print(el + " "));
        //numbers.stream().forEach(e -> System.out.print(e + " "));
    }
}
