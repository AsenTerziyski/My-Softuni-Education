package Pr01Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
//        Person person = new Person(name, age);
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
        Child child = new Child(name, age);
        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
