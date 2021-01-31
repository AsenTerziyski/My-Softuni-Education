import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] numbers = Arrays
//                .stream(scanner.nextLine()
//                        .split("\\s+"))
//                .mapToInt(Integer::parseInt)
//                .toArray();
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Function<List<Integer>, Integer> getLastMinElement = list-> list.lastIndexOf(list.stream().min(Integer::compare).get());
//        Function<List<Integer>, Integer> getLastMinElement = list -> {
//            int indexOfMinElement = 0;
//            int minElement = Integer.MAX_VALUE;
//            for (int i = list.size() - 1; i >= 0; i--) {
//                int currentElement = list.get(i);
//                if (currentElement < minElement) {
//                    minElement = currentElement;
//                    indexOfMinElement = i;
//                }
//            }
//            return indexOfMinElement;
//        };

        System.out.println(getLastMinElement.apply(numbers));
    }
}
