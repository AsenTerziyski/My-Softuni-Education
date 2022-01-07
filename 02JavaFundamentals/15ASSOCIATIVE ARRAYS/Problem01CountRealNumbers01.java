import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem01CountRealNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        // double[] nums2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(s-> Double.parseDouble(s)).toArray();

        Map<Double, Integer> counts = new TreeMap<>();
        for (double num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }

//        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
//            DecimalFormat df = new DecimalFormat("#.#######");
//            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
//        }
//
//        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
//            System.out.println(String.format("%.2f ---+++ >>> %d", entry.getKey(),entry.getValue()));
//        }

        counts.entrySet()
                .stream().limit(2)
                .filter(s-> s.getKey()>3)
                .sorted((first,second)-> first.getKey().compareTo(second.getKey()))
                .forEach(entry-> System.out.println(String.format("%.2f ---+++ >>> %d", entry.getKey(),entry.getValue())));

    }
}
