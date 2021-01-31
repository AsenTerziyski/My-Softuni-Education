import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class FP03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], Integer> getMinInt = num -> Arrays.stream(num).min().getAsInt();

        int[] intArray = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        //int minEl= Arrays.stream(Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray()).min().getAsInt();

        int minElement = getMinInt.apply(intArray);
        System.out.println(minElement);

    }
}
