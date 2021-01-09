import java.util.Arrays;
import java.util.Scanner;

public class arr07CondenseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int[] numbers = parseIntArray(input);

        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];

            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }

            numbers = condensed;
        }

        System.out.println(numbers[0]);
    }

    private static int[] parseIntArray(String[] input) {
//        int[] numbers = new int[input.length];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(input[i]);
//        }
//        return numbers;

        int[]numbers = Arrays
                .stream(input)
                .mapToInt(s-> Integer.parseInt(s))
                .toArray();
        return numbers;
    }
}
