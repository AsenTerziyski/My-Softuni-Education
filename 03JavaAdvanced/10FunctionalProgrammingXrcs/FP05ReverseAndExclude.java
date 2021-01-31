import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
//        Function<int[], int[]> reverseFunction = nums -> {
//            for (int i = 0; i < nums.length / 2; i++) {
//                int currentNum = nums[i];
//                nums[i] = nums[nums.length - 1 - i];
//                nums[nums.length - 1 - i] = currentNum;
//            }
//            return nums;
//        };
        Collections.reverse(numbers);
        Predicate<Integer> predicate = element -> element % n != 0;
        //numbers.stream().filter(num -> num % 2 != 0).forEach(e -> System.out.print(e + " "));
        numbers
                .stream()
                .filter(e->predicate.test(e))
                .forEach(e-> System.out.print(e + " "));
//
//        numbers
//                .stream()
//                .filter(predicate::test)
//                .forEach(e-> System.out.print(e + " "));


    }
}
