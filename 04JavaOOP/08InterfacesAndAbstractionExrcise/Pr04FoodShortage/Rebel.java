package Pr04FoodShortage;

public class Rebel implements Buyer {
    private static final int FOOD_INCREASE_REBEL = 5;
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.setName(name);
        this.setAge(age);
        this.setGroup(group);
    }

    private void setName(String name) {
        this.name = name;
    }
    private void setGroup(String group) {
        this.group = group;
    }
    private void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return this.group;
    }

    public int getFood() {
        return this.food;
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
    public void buyFood() {
        increaseFood();
    }

    private void increaseFood() {
        this.food += FOOD_INCREASE_REBEL;
    }
}
