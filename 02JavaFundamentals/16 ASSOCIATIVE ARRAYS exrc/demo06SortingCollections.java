import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo06SortingCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("\\s+");

        int[] inputNumbers = Arrays
                .stream(inputString)
                .mapToInt(s-> Integer.parseInt(s))
                .toArray();

        List<Integer> nums = Arrays.stream(inputString)
                .map(n-> Integer.parseInt(n))
                .sorted((n1,n2)->n1.compareTo(n2))
                .collect(Collectors.toList());

        for (Integer num : nums) {
            System.out.printf("%d + >> %n", num);
        }

        List<Integer> nums2 = Arrays.stream(inputString)
                .map(n-> Integer.parseInt(n))
                .sorted((n1,n2)->n2.compareTo(n1))
                .collect(Collectors.toList());

        for (Integer num : nums2) {
            System.out.printf("%d + > << > %n", num);
        }

    }
}
