package IC05ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            String[] info = input.split("\\s+");
            String name = info[0];
            int age = Integer.parseInt(info[1]);
            String town = info[2];
            Person person = new Person(name, age, town);
            people.add(person);
            input = scanner.nextLine();
        }

        int n = Integer.parseInt(scanner.nextLine());
        Person searchPerson = people.get(n - 1);
        int countEqualPeople = 0;
        for (Person person : people) {
            if (person.compareTo(searchPerson) == 0) {
                countEqualPeople++;
            }
        }

        if (countEqualPeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(String.format("%d %d %d",
                    countEqualPeople,
                    people.size() - countEqualPeople,
                    people.size()));
        }
        // write your code here
    }
}
