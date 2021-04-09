package demo05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class People {
    private ArrayList<Person> people;

    public People() {
        this.people = new ArrayList<>();
    }
    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getPeople() {
        return Collections.unmodifiableList(this.people);
    }
}
