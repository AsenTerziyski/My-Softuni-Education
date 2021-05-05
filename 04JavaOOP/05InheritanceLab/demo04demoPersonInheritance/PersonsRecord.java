package demo04demoPersonInheritance;

import java.util.ArrayList;

public class PersonsRecord {
    ArrayList<Person> personRecord;

    public PersonsRecord() {
        this.personRecord = new ArrayList<>();
    }

    public void addPerson (Person person) {
        if (Validate.validatePersonIsNotNull(person)) {
            this.personRecord.add(person);
        }
    }

    public ArrayList<Person> getPersonRecord() {
        return this.personRecord;
    }
}
