import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int[] nums = new int[input.length];
        for (int i = 0; i <input.length; i++) {
            nums[i] = (Integer.parseInt(input[i]));
        }
        int sum = Arrays.stream(nums).sum();
        double average = Arrays.stream(nums).average().getAsDouble();

        int[] exit =  Arrays.stream(nums).sorted().filter(n-> n>=5).limit(10).toArray();

        Arrays.stream(exit).forEach(n-> System.out.println(n));

    }
}
