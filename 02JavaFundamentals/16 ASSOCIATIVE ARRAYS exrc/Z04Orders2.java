import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Z04Orders2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Double> exit = new LinkedHashMap<>();
        double totalSum = 0;

        while (!"buy".equals(input)) {
            //Beer 2.20 100
            String product = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int currentQuantity = Integer.parseInt(input.split("\\s+")[2]);

            double curentTotalPrice = price * currentQuantity;
            exit.putIfAbsent(product, 0.00);
            exit.put(product, exit.get(product) + curentTotalPrice);

            input = scanner.nextLine();
        }

        exit.entrySet().stream().forEach(e-> System.out.println(String.format("%s -> %.2f", e.getKey(), e.getValue())));

//        for (Double value : exit.values()) {
//            totalSum = totalSum + value;
//        }
//        System.out.println(totalSum);

    }
}
