import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class mapsDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> result = new LinkedHashMap<>();

        double[] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        for (double value : values) {
            if (!result.containsKey(value)) {
                result.put(value, 1);
            } else {
                result.put(value, result.get(value) + 1);
            }


        }
        //result.entrySet().stream().filter(n-> n.getValue()>2).forEach(num-> System.out.println(num));
        result.forEach((key, value) -> System.out.println(String.format("%.1f -> appears %d times!", key, value)));
    }
}
