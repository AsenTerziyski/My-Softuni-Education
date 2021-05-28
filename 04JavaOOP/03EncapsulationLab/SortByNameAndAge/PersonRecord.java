package SortByNameAndAge;

import java.util.ArrayList;
import java.util.Collections;

public class PersonRecord {
    ArrayList<Person> personArrayList;

    public PersonRecord() {
        this.personArrayList = new ArrayList<>();
    }

    public void addPerson (Person person) {
        this.personArrayList.add(person);
    }

    public void removePerson (Person person) {
        Validator.validatePersonRecord(this.personArrayList, person);
        this.personArrayList.remove(person);
    }

    public ArrayList<Person> getPersonArrayList() {
        return this.personArrayList;
    }
}
