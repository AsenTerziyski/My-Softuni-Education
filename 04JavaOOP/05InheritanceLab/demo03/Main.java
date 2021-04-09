package demo03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("George", "School");
        Worker worker = new Worker("Ivan", "Company");
        Person person = new Person("Kiro");

        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(worker);

        for (Person person1 : people) {
            System.out.println(person1.name);
        }

        people.add(student);
        for (Person person1 : people) {
            System.out.println(person1.name);
        }

        student.study();
        worker.work();

    }
}
