package IC06StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<Person> setByName = new TreeSet<>(new ComparatorByName());
        Set<Person> setByAge = new TreeSet<>(new ComparatorByAge());

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            setByName.add(person);
            setByAge.add(person);
        }
        setByName.stream()
                .forEach(System.out::println);
        setByAge.stream()
                .forEach(System.out::println);

    }
}
