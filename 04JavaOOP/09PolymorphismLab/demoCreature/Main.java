package demoCreature;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Person("Male", "Peter");
        System.out.println(animal1.getName());

        System.out.println(animal1.getClass());
        String sex = ((Person) animal1).getSex();
        System.out.println(sex);

        Person person1 = new Person("Female", "Maria");
        System.out.println(person1.getName());
        System.out.println(person1.getSex());

        Animal snake = new Snake("Tommy");
        System.out.println(snake.getName());
        System.out.println();
        Snake snake1 = new Snake("Peter The Snake");
        Animal snake2 = new Snake("Lambda The Other Snake");
        System.out.println(snake2.getName());
        ((Snake) snake2).makeSound();
        System.out.println(((Snake) snake2).getName());
        System.out.println("Snake " + snake1.getName() + " makes sound:");
        snake1.makeSound();

    }
}
