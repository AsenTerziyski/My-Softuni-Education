package Pr04PizzaCaloriesRefactoring;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (Validator.validateToppingType(toppingType)) {
            this.toppingType = toppingType;
        }
    }

    private void setWeight(double weight) {
        if (Validator.validateToppingWeight(weight, this.toppingType)) {
            this.weight = weight;
        }

    }

    public double calculateCalories() {
        return this.weight * 2.00 * this.getModifiersByToppingType(this.toppingType);

    }

    private double getModifiersByToppingType(String toppingType) {
        switch (toppingType) {
            case "Meat":
                return 1.2;
            case "Veggies":
                return 0.8;
            case "Cheese":
                return 1.1;
            case "Sauce":
                return 0.9;
            default:
                return 0.00;
        }
    }
}
