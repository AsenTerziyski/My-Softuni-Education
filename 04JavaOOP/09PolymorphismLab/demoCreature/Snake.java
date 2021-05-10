package demoCreature;

public class Snake extends Reptile implements Animal  {
    private String name;

    public Snake(String name) {
        this.name = name;
    }

    @Override
    protected void makeSound() {
        super.makeSound();
    }

    @Override
    public String getName() {
        return this.name;
    }


}
