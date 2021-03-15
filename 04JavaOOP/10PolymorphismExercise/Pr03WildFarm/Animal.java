package Pr03WildFarm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    protected Animal(String animalType, String animalName, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    // makeSound is abstract method, so it does not need body -> {......}. If
    // not abstract -> body must be empty it this case:
    public abstract void makeSound();

    //it is the same wit eat method:
    public abstract void eat(Food food);
}
