import java.util.Arrays;
import java.util.Scanner;

public class Prblm07BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int target = Integer.parseInt(scanner.nextLine());
        int index = binarySearch(numbers, target, 0, numbers.length-1);
        System.out.println(index);
    }

    private static int binarySearch(int[] numbers, int target, int start, int end) {
        while (end >= start) {
            int half = (end + start) / 2;
            if (numbers[half] < target) {
                start = half + 1;
            } else if (numbers[half] > target) {
                end = half - 1;
            } else {
                return half;
            }
        }
        return -1;
    }
}

