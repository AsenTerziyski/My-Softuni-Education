package demoCreature;

public class Person extends Mammal implements Animal {
    private String name;
    private String sex;

    public Person(String sex, String name) {
        super(sex);
        this.name = name;
    }

    @Override
    protected String getSex() {
        return super.getSex();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
