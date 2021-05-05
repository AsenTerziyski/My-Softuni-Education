package Pr04PizzaCaloriesRefactoring;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (Validator.validateFlourType(flourType)) {
            this.flourType = flourType;
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (Validator.validateBackingTechnique(bakingTechnique)) {
            this.bakingTechnique = bakingTechnique;
        }
    }

    private void setWeight(double weight) {
        if (Validator.validateDoughWeight(weight)) {
            this.weight = weight;
        }
    }

    public double calculateCalories() {
        return this.weight
                * 2
                * this.getModifierByBakingTechniques(this.bakingTechnique)
                * this.getModifierByFlourType(this.flourType);
    }

    private double getModifierByFlourType(String flourType) {
        switch (flourType) {
            case "White":
                return 1.5;
            case "Wholegrain":
                return 1.0;
            default:
                return 0.0;
        }
    }

    private double getModifierByBakingTechniques(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
                return 0.9;
            case "Chewy":
                return 1.1;
            case "Homemade":
                return 1.0;
            default:
                return 0.0;
        }
    }

}
