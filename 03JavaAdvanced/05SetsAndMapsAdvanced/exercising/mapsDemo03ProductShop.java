import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class mapsDemo03ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> shops = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("revision")) {
            String[] tokens = input.split(", ");

            String foodShop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shops.putIfAbsent(foodShop, new TreeMap<>());
            shops.get(foodShop).put(product, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> shopsEntry : shops.entrySet()) {

            StringBuilder sb = new StringBuilder();
            String shopName = shopsEntry.getKey();
            sb.append(shopName + "->").append(System.lineSeparator());

            Map<String, Double> productEntry = shopsEntry.getValue();
            for (Map.Entry<String, Double> stringDoubleEntry : productEntry.entrySet()) {
                String productName = stringDoubleEntry.getKey();
                double price = stringDoubleEntry.getValue();
                String outputProductInfo = String.format("Product: %s, Price: %.1f", productName, price);
                sb.append(outputProductInfo).append(System.lineSeparator());
            }

            System.out.println(sb.toString().trim());
        }
    }
}
