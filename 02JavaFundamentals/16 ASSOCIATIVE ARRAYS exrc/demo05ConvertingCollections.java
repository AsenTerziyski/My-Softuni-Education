import java.util.*;
import java.util.stream.Collectors;

public class demo05ConvertingCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .filter(n -> n > 10 && n < 100 && n != 75).limit(10)
                .toArray();

        num1 = Arrays.stream(num1)
                .filter(num -> num > 50 && num <= 99)
                .toArray();

        num1 = Arrays.stream(num1).sorted().toArray();

        for (int i = 0; i < num1.length; i++) {
            if (i != num1.length - 1) {
                System.out.print(num1[i] + ">");
            } else {
                System.out.print(num1[i]);
            }
        }
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        List<Integer> nums2 = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        Collections.sort(nums2);
        Collections.reverse(nums2);
        for (int i = 0; i < nums2.size(); i++) {
            if (i != nums2.size() - 1) {
                System.out.print(nums2.get(i) + "<<");
            } else {
                System.out.print(nums2.get(i));
            }

        }
    }
}
