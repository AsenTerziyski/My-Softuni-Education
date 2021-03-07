package Pr01SingleInheritance;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        // ako e: Animal doggy = new Dog() => може doggy.eat(); , но вече не може: doggy.bark();
    }
}
