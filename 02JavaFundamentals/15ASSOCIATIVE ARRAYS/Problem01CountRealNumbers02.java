import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem01CountRealNumbers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numberOccurences = new TreeMap<>();
        String[] inputDoubles = scanner.nextLine().split("\\s+");

        for (int i = 0; i < inputDoubles.length; i++) {
            double number = Double.parseDouble(inputDoubles[i]);
            Integer occurences = numberOccurences.get(number);
            if (occurences == null) {
                occurences = 0;
            }

            numberOccurences.put(number, occurences + 1);

        }

        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
            //System.out.println(entry.getKey() + " -> " + entry.getValue());
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
