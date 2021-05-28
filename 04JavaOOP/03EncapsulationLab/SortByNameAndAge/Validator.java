package SortByNameAndAge;

import java.util.ArrayList;

public class Validator {
    public static void validateAge(int age) {
        if (age<=0 || age>=120) {
            throw new IllegalArgumentException(ExceptionalMessages.notValidAge);
        }

    }

    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionalMessages.notValidName);
        }

    }


    public static void validatePersonRecord(ArrayList<Person> personArrayList, Person person) {

    }
}
