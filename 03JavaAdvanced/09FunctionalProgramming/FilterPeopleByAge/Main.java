package FilterPeopleByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Person> createPerson = str -> {
            String[] tokens = str.split(", ");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            return person;
        };

        List<Person> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Person person = createPerson.apply(scanner.nextLine());
            people.add(person);
        }

        BiFunction<Integer, List<Person>, List<Person>> filterListOfPersonsOlderThan = (a, personList) -> {
            List<Person> filteredPeople = new ArrayList<>();
            for (Person person : personList) {
                if (person.getAge() >= a) {
                    filteredPeople.add(person);
                }
            }
            if (!filteredPeople.isEmpty()) {
                return filteredPeople;
            } else {
                throw new IllegalArgumentException(String.format("NoPersonsOlderThan %d", a));
            }
        };

        BiFunction<Integer, List<Person>, List<Person>> filterListOfPersonsYoungerThan = (a, personList) -> {
            List<Person> filteredPeople = new ArrayList<>();
            for (Person person : personList) {
                if (person.getAge() <= a) {
                    filteredPeople.add(person);
                }
            }
            if (!filteredPeople.isEmpty()) {
                return filteredPeople;
            } else {
                throw new IllegalArgumentException(String.format("No Persons younger than %d", a));
            }
        };


        BiFunction<String, List<Person>, String> formatOutputString = (str, personList) -> {
            String[] formatTokens = str.split("\\s+");
            StringBuilder sb = new StringBuilder();
            if (formatTokens.length == 2) {
                for (Person person : personList) {
                    sb.append(String.format("%s - %d", person.getName(), person.getAge())).append(System.lineSeparator());
                }
            } else if (formatTokens.length == 1) {
                String ageOrName = formatTokens[0];
                switch (ageOrName) {
                    case "age":
                        for (Person person : personList) {
                            sb.append(String.format("%d", person.getAge())).append(System.lineSeparator());
                        }
                        break;
                    case "name":
                        for (Person person : personList) {
                            sb.append(String.format("%s", person.getName())).append(System.lineSeparator());
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Not valid age or name!");
                }
            } else {
                throw new IllegalArgumentException("Wrong format!");
            }
            return sb.toString().trim();
        };

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        switch (condition) {
            case "older": {
                List<Person> filteredPersonsOlder = filterListOfPersonsOlderThan.apply(age, people);
                String output = formatOutputString.apply(format, filteredPersonsOlder);
                System.out.println(output);
                break;
            }
            case "younger": {
                List<Person> filteredPersons = filterListOfPersonsYoungerThan.apply(age, people);
                String output = formatOutputString.apply(format, filteredPersons);
                System.out.println(output);
            }
            break;
            default:
                throw new IllegalArgumentException("Not correct condition!");
        }

    }
}
