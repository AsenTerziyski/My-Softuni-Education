import java.util.ArrayList;
import java.util.Scanner;

public class OCU07OrderByAge {

    static class Person {
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> listPersons = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] personsData = input.split("\\s+");
            fillListOFPersons(listPersons, personsData);

            input = scanner.nextLine();
        }

        sortByAgePrintList(listPersons);
    }

    private static void fillListOFPersons(ArrayList<Person> listPersons, String[] personsData) {
        String namePerson = personsData[0];
        String idPerson = personsData[1];
        int agePerson = Integer.parseInt(personsData[2]);
        Person currentPerson = new Person(namePerson, idPerson, agePerson);
        listPersons.add(currentPerson);
    }

    private static void sortByAgePrintList(ArrayList<Person> listPersons) {
        listPersons.stream().
                sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).
                forEach(person -> System.out.printf("%s with ID: %s is %d years old.%n",
                        person.getName(), person.getId(), person.getAge()));
    }

}
