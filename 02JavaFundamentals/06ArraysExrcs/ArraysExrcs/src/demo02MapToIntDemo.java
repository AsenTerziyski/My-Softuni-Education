import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class demo02MapToIntDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
