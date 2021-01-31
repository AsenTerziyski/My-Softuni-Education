import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FPdemo01ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nums.length / 2; i++) {
            int currentNum = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = currentNum;
        }

        ArrayList<Integer> removedNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                removedNumbers.add(nums[i]);
            }
        }

        removedNumbers
                .stream()
                .forEach(e-> System.out.print(e + " "));

    }
}
