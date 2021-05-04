package Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person("Name1", 20);
        Person person2 = new Person("Name2", 30);
        Person person3 = new Person("Name3", 40);
        //Person person4 = new Person(" ", 100);
        //Person person5 = new Person(" + ", -10);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println();
        Person student1 = new Student("Name4", 15, "School A");
        Person student2 = new Student("Name5", 17, "School B");

        Student student3 = new Student("NameX", 10, "X");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println();
        Person worker1 = new Worker("Name6", 50, "D");
        Person worker2 = new Worker("Name7", 60, "E");
        System.out.println(worker1);
        System.out.println(worker2);
        Worker worker3 = new Worker("NameX", 70, "X");
        System.out.println(worker3);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        student3.study();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(worker3.work("digging"));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("PROGRAM FINISHED");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    }
    static {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("START PROGRAM");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println();
    }

}
