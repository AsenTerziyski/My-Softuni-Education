import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Z02MinorTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> resourses = new LinkedHashMap<>();
        while (!"stop".equals(input)) {
            int q = Integer.parseInt(scanner.nextLine());
            resourses.putIfAbsent(input, 0);
            int currentQuantity = resourses.get(input);
            if (resourses.containsKey(input)) {
                resourses.put(input, currentQuantity + q);
            }
            input = scanner.nextLine();
        }

        resourses
                .entrySet()
                .stream()
                .forEach(entry -> System.out.println(String.format("%s -> %d", entry.getKey(), entry.getValue())));

    }
}
