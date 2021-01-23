import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SM04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] realNumbers = getDoubles(scanner);
        Map<Double, Integer> output = new LinkedHashMap<>();

        for (double number : realNumbers) {
            output.putIfAbsent(number, 0);
            output.put(number, output.get(number) + 1);
        }

        printMap(output);
    }

    private static double[] getDoubles(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        return Arrays.stream(input)
                .mapToDouble(realNum -> Double.parseDouble(realNum))
                .toArray();
    }

    private static void printMap(Map<Double, Integer> output) {
        output.entrySet()
                .forEach(s -> System.out.println(String.format("%.1f -> %d", s.getKey(), s.getValue())));
    }
}
