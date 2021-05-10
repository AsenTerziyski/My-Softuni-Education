package demoCreature;

public abstract class Mammal {
    protected String sex;

    public Mammal(String sex) {
        this.sex = sex;
    }

    protected String getSex () {
        return this.sex;
    }
}
