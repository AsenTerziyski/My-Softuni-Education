package Pr04FoodShortage;

public class Citizen implements Birthable, Identifiable, Buyer {

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
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setName(String name) {
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

    private void increaseFood() {
        this.food += FOOD_INCREASE;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
