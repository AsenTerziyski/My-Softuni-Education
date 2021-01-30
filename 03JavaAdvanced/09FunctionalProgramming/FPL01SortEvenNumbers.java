
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FPL01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays
                .stream(scanner.nextLine()
                        .split(", "))
                .mapToInt(num -> Integer.parseInt(num))
                .filter(i -> i % 2 == 0)
                .toArray();

//        int[] n = Arrays
//                .stream(scanner.nextLine()
//                        .split(", "))
//                .mapToInt(Integer::parseInt)
//                .filter(MathATT::isEven)
//                .toArray();

        System.out.println(formatArray(n));
        Arrays.sort(n);
        System.out.println(formatArray(n));
    }

    public static String formatArray(int[] arr) {
        return Arrays
                .stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }

}
