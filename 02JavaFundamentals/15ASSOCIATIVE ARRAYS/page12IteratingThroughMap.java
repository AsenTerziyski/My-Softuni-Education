import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class page12IteratingThroughMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> fruitsPrices = new LinkedHashMap<>();
        fruitsPrices.put("banana", 2.50);
        fruitsPrices.put("ween", 3.50);
        fruitsPrices.put("apple", 4.50);
        fruitsPrices.put("kiss", 5.50);
        fruitsPrices.put("fuck", 6.50);
        fruitsPrices.put("fu", 6.50);
        fruitsPrices.put("f", 6.50);
        fruitsPrices.put("fbbbbbbbbb", 6.50);
        fruitsPrices.remove("banana");
        fruitsPrices.remove("fuck");

//        for (Map.Entry<String, Double> entry : fruitsPrices.entrySet()) {
//            System.out.printf("%s: the price is %.2f per fuck%n", entry.getKey(), entry.getValue());
//        }

        fruitsPrices
                .entrySet()
                .stream()
                .sorted((first, second)-> first.getValue().compareTo(second.getValue())).
                limit(4)
                .filter(s-> s.getValue()>=4.50)
                .forEach(entry-> System.out.println(String.format("%s costs %.3f leva", entry.getKey(), entry.getValue())));
    }
}
