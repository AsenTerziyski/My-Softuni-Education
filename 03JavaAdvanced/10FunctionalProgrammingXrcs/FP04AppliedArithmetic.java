import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class FP04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], int[]> addOne = numbers -> Arrays.stream(numbers).map(n -> n + 1).toArray();
        Function<int[], int[]> multiplyByTwo = numbers -> Arrays.stream(numbers).map(n -> n * 2).toArray();

        Consumer<int[]> printIntArray = numbers -> Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));

        String command = "";
        while (!(command = scanner.nextLine()).equalsIgnoreCase("end")) {

            switch (command) {
                case "add":
                    intArray = addOne.apply(intArray);
                    break;
                case "multiply":
                    intArray = multiplyByTwo.apply(intArray);
                    break;
                case "subtract":
                    intArray = Arrays.stream(intArray)
                            .map(n -> n - 1)
                            .toArray();
                    break;
                case "print":
//                    Arrays
//                            .stream(intArray)
//                            .forEach(n -> System.out.print(n + " "));
                    printIntArray.accept(intArray);
                    System.out.println();
                    break;
            }
        }
    }
}
