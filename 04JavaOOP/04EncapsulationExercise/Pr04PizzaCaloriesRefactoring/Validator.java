package Pr04PizzaCaloriesRefactoring;

public class Validator {

    static boolean validateFlourType(String flourType) {
        if (!"White".equals(flourType)
                && !"Wholegrain".equals(flourType)) {
            throw new IllegalArgumentException(ExceptionMessages.DOUGH);
        }
        return true;
    }

    static boolean validateBackingTechnique(String bakingTechnique) {
        if (!"Crispy".equals(bakingTechnique)
                && !"Chewy".equals(bakingTechnique)
                && !"Homemade".equals(bakingTechnique)) {
            throw new IllegalArgumentException(ExceptionMessages.DOUGH);
        }
        return true;
    }

    static boolean validateDoughWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_WEIGHT);
        }
        return true;
    }

    static boolean validatePizzaName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException(ExceptionMessages.PIZZA_NAME_EXCEPTION_MESSAGES);
        }
        return true;
    }

    static boolean validateNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException(ExceptionMessages.NUMBER_OF_TOPPINGS_EXCEPTION);
        }
        return true;
    }

    static boolean validateToppingType(String toppingType) {
        if (!"Meat".equals(toppingType)
                && !"Veggies".equals(toppingType)
                && !"Cheese".equals(toppingType)
                && !"Sauce".equals(toppingType)) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.TOPPING_TYPE_EXCEPTION, toppingType));
        }
        return true;
    }

    static boolean validateToppingWeight(double weight, String toppingType) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.TOPPING_WEIGHT_EXCEPTION, toppingType));
        }
        return true;
    }
}
