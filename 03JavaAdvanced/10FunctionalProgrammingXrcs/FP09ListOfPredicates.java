import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//        Set<Integer> numbers = Arrays
//                .stream(scanner.nextLine().split("\\s+"))
//                .mapToInt(Integer::parseInt)
//                .boxed().collect(Collectors.toSet());
        Set<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toCollection(HashSet::new));
//                //other way to fill Set:
//        Set<Integer> numbers = new LinkedHashSet<>();
//        int[] numArray = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .mapToInt(num-> Integer.parseInt(num)).toArray();
//        for (int i = 0; i <numArray.length; i++) {
//            numbers.add(numArray[i]);
//        }
        Predicate<Integer> isDivisible = number -> {
            for (Integer divider : numbers) {
                if (number % divider != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= n; i++) {
            boolean result = isDivisible.test(i);
            if (result) {
                System.out.print(i + " ");
            }
        }

    }
}
