import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class demo06SortingByMultipleCriteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Map<String, Integer> products = new HashMap<>();
        for (int i = 0; i < input.length; i = i + 2) {
            // apple 2 kiwi 3 redApple 4 kiwiRed 150 blueKiwi 150 apple 25
            String product = input[i];
            Integer quantity = Integer.parseInt(input[i + 1]);
            products.putIfAbsent(product, quantity);
        }

        products
                .entrySet()
                .stream()
                .sorted((p1, p2) -> {
            int result = p1.getValue().compareTo(p2.getValue());
            if (result == 0) {
                result = p1.getKey().compareTo(p2.getKey());
            }
            return result;
        })
                .forEach(e -> System.out.println(e.getKey() + "/////" + e.getValue()));
    }
}
