package Pr04PizzaCaloriesRefactoring;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pizzaTokens = scanner.nextLine().split("\\s+");
        String[] doughTokens = scanner.nextLine().split("\\s+");
        try {
            int countOfToppings = Integer.parseInt(pizzaTokens[2]);
            Pizza pizza = new Pizza(pizzaTokens[1], countOfToppings);
            Dough dough = new Dough(doughTokens[1], doughTokens[2], Double.parseDouble(doughTokens[3]));
            pizza.setDough(dough);
            for (int i = 0; i < countOfToppings; i++) {
                String input = scanner.nextLine();
                if (input.equals("END")) {
                    break;
                }
                String[] toppingTokens = input.split("\\s+");
                Topping topping = new Topping(toppingTokens[1], Double.parseDouble(toppingTokens[2]));
                pizza.addTopping(topping);
            }
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getOverallCalories()));

        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        }

    }
}
