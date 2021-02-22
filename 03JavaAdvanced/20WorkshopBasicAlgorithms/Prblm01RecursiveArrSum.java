import java.util.Arrays;
import java.util.Scanner;

public class Prblm01RecursiveArrSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(n -> Integer.parseInt(n))
                .toArray();
        System.out.println(sum(numbers, 0));
    }

    private static int sum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + sum(arr, index + 1);
    }
}
