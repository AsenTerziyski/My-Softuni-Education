package pr05CustomException;

import pr05CustomException.Person;

public class Main {
    public static void main(String[] args) {

        Person person = null;
        try {
            person = new Person("s", "25", 100);
            System.out.println(person.toString());
        } catch (InvalidPersonNameException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
