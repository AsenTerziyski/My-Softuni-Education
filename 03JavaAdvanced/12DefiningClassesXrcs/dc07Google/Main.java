package dc07Google;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            Person person = new Person(tokens[0]);

            boolean existPerson = false;
            for (Person currentPerson : people) {
                if (currentPerson.getName().equalsIgnoreCase(tokens[0])) {
                    person = currentPerson;
                    existPerson = true;
                }
            }

            switch (tokens[1]) {

                case "company":
                    Company company = new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    person.setCompany(company);
                    break;

                case "pokemon":
                    Pokemon pokemon = new Pokemon(tokens[2], tokens[3]);
                    List<Pokemon> pokemons = person.getPokemons();
                    pokemons.add(pokemon);
                    person.setPokemons(pokemons);
                    break;

                case "parents":
                    Parent parent = new Parent(tokens[2], tokens[3]);
                    List<Parent> parents = person.getParents();
                    parents.add(parent);
                    person.setParents(parents);
                    break;

                case "children":
                    Child child = new Child(tokens[2], tokens[3]);
                    List<Child> children = person.getChildren();
                    children.add(child);
                    person.setChildren(children);
                    break;

                case "car":
                    Car car = new Car(tokens[2], Integer.parseInt(tokens[3]));
                    person.setCar(car);
                    break;

            }

            if (!existPerson) {
                people.add(person);
            }

            line = scanner.nextLine();
        }

        String targetName = scanner.nextLine();

        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(targetName)) {
                StringBuilder sb = new StringBuilder();

                sb
                        .append(person.getName())
                        .append(System.lineSeparator());

                sb.append("Company:").append(System.lineSeparator());
                if (person.getCompany() != null) {
                    sb
                            .append(person.getCompany().toString())
                            .append(System.lineSeparator());
                }

                sb.append("Car:").append(System.lineSeparator());
                if (person.getCar() != null) {
                    sb
                            .append(person.getCar().toString())
                            .append(System.lineSeparator());
                }

                sb.append("Pokemon:").append(System.lineSeparator());
                for (Pokemon pokemon : person.getPokemons()) {
                    sb.append(pokemon.toString()).append(System.lineSeparator());
                }

                sb.append("Parents:").append(System.lineSeparator());
                for (Parent parent : person.getParents()) {
                    sb.append(parent.toString()).append(System.lineSeparator());
                }

                sb.append("Children:").append(System.lineSeparator());
                for (Child child : person.getChildren()) {
                    sb.append(child.toString()).append(System.lineSeparator());
                }

                System.out.println(sb.toString());
                break;
            }
        }
    }
}
