import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SME06MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> minersCollection = new LinkedHashMap<>();

        while (!input.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());

            if (!minersCollection.containsKey(input)) {
                minersCollection.put(input, quantity);
            } else {
                minersCollection.put(input, minersCollection.get(input) + quantity);
            }

            input = scanner.nextLine();
        }

        minersCollection.entrySet().stream().forEach(mat -> {

            String materialToPrint = mat.getKey();
            int quantityToPrint = mat.getValue();
            System.out.println(String.format("%s -> %d", materialToPrint, quantityToPrint));

        });

    }

}
