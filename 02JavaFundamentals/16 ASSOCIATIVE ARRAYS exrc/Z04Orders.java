import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.Scanner;

public class Z04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] tokens = input.split("\\s+");
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quntity = Integer.parseInt(tokens[2]);

            priceMap.put(product, price);
            quantityMap.putIfAbsent(product, 0);
            int newQuantity = quantityMap.get(product) + quntity;
            quantityMap.put(product, newQuantity);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            System.out.println(String.format("%s -> %.2f", entry.getKey(), entry.getValue()*quantityMap.get(entry.getKey())));
        }

//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//
//        quantityMap
//                .forEach((key, value) -> System.out.println(String.format("%s -> %.2f", key, value * priceMap.get(key))));
    }
}
