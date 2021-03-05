package demo01;

public class Cat extends Organism {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public Cat(int age, String name, String color) {
        super(age, name);
        this.color = color;
    }
    public void gainEnergy() {
        System.out.println(String.format("%s, color %s years %d old is gaining energy", this.name, this.color, this.age));
    }
}
