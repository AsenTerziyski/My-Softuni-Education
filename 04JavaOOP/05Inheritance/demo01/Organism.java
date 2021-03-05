package demo01;

public class Organism {
    protected int age;
    protected String name;

    public Organism() {
    }

    public Organism(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void gainEnergy () {
        System.out.println(String.format("%s, years %d old is gaining energy", this.name, this.age));
    }
}
