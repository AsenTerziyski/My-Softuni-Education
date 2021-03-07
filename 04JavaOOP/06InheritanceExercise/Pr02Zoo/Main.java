package Pr02Zoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal("Animal");
        System.out.println(animal.getName());
        Mammal mammal = new Mammal("Mammal");
        System.out.println(mammal.getName());
        Bear bear = new Bear("Bear");
        System.out.println(bear.getName());
        Snake snake = new Snake("Snake");
        System.out.println(snake.getName());
        // write your code here
    }
}
