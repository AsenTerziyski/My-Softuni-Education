package GenericsDemo02Animals;

public class Main {

    public static void main(String[] args) {
        feedAnimal(new Animal());
        feedAnimal(new Goat());
        feedAnimal(new Dog());
        feedAnimal(new Mouse());
    }

    public static <T extends Animal> void feedAnimal (T animal) {
        animal.eat();
    }

}
