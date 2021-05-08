package demo01DefineAnInterfacePerson;

import Pr01DefineAnInterfacePerson.Citizen;

import java.util.ArrayList;

public class PersonsList {
    private ArrayList<PersonD> personDSList;

    public PersonsList() {
        this.personDSList = new ArrayList<>();
    }

    public void addPerson(PersonD personD) {
        CitizenValidation.personValidate(personD);
        this.personDSList.add(personD);
    }

    public PersonD removePerson(PersonD personD) {
        CitizenValidation.personsListIsNotEmptyValidate(this.personDSList);
        if (this.personDSList.contains(personD)) {
            this.personDSList.remove(personD);
        } else {
            throw new IllegalArgumentException("Person can not be removed because he does not exist in the collection.");
        }
        return personD;
    }
}
