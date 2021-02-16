import java.util.*;
import java.util.stream.Collectors;

public class Pr01Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.queue - readQueue - poll, peek, offer
        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        //2.stack - readStack - pop, peek, push
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);

        Map<Integer, String> cookingTable = new HashMap<>();
        cookingTable.put(25, "Bread");
        cookingTable.put(50, "Cake");
        cookingTable.put(75, "Pastry");
        cookingTable.put(100, "Fruit Pie");

        Map<String, Integer> productCooked = new TreeMap<>();

        cookingTable
                .values()
                .stream()
                .forEach(p-> productCooked.put(p, 0));

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            // цикълът се върти докато не са емпти
            int currentLiquid = liquids.poll();
            int currentIngredient = ingredients.pop();

            int sum = currentLiquid + currentIngredient;

            if (ableToCookProduct(sum)) {
                String product = cookingTable.get(sum);
                //productCooked.putIfAbsent(product, 0);
                productCooked.put(product, productCooked.get(product) + 1);
            } else {
                ingredients.push(currentIngredient + 3);
            }

        }

        if (hasCookedEachMeal(productCooked)) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");
        }

        System.out.println("Liquids left: " + getElementsInfo(liquids));
        System.out.println("Ingredients left: " + getElementsInfo(ingredients));

        for (Map.Entry<String, Integer> entry : productCooked.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
        }

    }

    private static String getElementsInfo(ArrayDeque<Integer> deque) {
        if (deque.isEmpty()) {
            return "none";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Integer integer : deque) {
                sb.append(integer).append(", ");
            }
            return sb.substring(0, sb.length()-2).trim();
        }
    }

    private static boolean hasCookedEachMeal(Map<String, Integer> productCooked) {
        for (Integer value : productCooked.values()) {
            if (value ==0) {
                return false;
            }
        }
        return true;
    }

    private static boolean ableToCookProduct(int sum) {
        return (sum == 25 || sum == 50 || sum == 75 || sum == 100);
    }
}
