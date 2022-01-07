import java.util.Arrays;
import java.util.Scanner;

public class demo04ManipulatingCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("\\s+");

        int[] nums = Arrays.stream(inputString)
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + "-");
            }
        }
        System.out.println();

        String[] words = scanner.nextLine().split("\\s+");
        words =
                Arrays.stream(words)
                        .map(w -> w + "xxx")
                        .toArray(String[]::new);

        for (int i = 0; i <words.length; i++) {
            System.out.print(words[i]);
        }
    }
}
