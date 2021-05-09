package Pr04FoodShortage;

public class Citizen implements Birthable, Identifiable, Buyer, Person {

    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;
    private static final int FOOD_INCREASE = 10;

    public Citizen(String name, int age, String id, String birthDate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDate(birthDate);
//        this.food = 0;
    }

    private void setBirthDate(String birthDate) {
        Validator.validateBirthDate(birthDate);
        this.birthDate = birthDate;
    }

    private void setId(String id) {
        Validator.validateId(id);
        this.id = id;
    }

    private void setName(String name) {
        Validator.validateName(name);
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void buyFood() {
        this.increaseFood();
    }

    public void increaseFood() {
        int i = FoodIncreaser.increaseFood(this.food, FOOD_INCREASE);
        this.food = i;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
