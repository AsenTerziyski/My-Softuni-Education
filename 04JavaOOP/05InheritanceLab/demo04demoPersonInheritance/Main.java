package demo04demoPersonInheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person("A", 10);
        System.out.println(person1);

        Person student2 = new Student("B", 17, "School B");
        Student student3 = new Student("C", 12, "School C");
        student3.studyLesson("Mathematics");
        System.out.println(student2);
        Worker worker4 = new Worker("D", 35, "Company D");
        System.out.println(worker4.getWorkerID());
        Person worker5 = new Worker("E", 75, "Company C");

        PersonsRecord personsRecord = new PersonsRecord();
        personsRecord.addPerson(person1);
        personsRecord.addPerson(student2);
        personsRecord.addPerson(student3);
        personsRecord.addPerson(worker4);
        personsRecord.addPerson(worker5);


        ArrayList<Person> personRecord = personsRecord.getPersonRecord();
        for (Person person : personRecord) {
            System.out.println(person);
        }

        for (int i = 0; i <personRecord.size(); i++) {
            if (personRecord.get(i).personID >=3) {
                personRecord.remove(i);
            }
        }
        for (Person person : personRecord) {
            System.out.println(person);
        }
    }

}
