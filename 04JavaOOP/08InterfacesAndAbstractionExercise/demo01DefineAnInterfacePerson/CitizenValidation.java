package demo01DefineAnInterfacePerson;

import java.util.ArrayList;

public class CitizenValidation {

    static boolean ageValidate(int age) {
        if (age <= 0 || age >= 120) {
            throw new IllegalArgumentException(ExceptionMessages.NOT_VALID_AGE);
        }
        return true;
    }

    static boolean nameValidate(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.NOT_VALID_NAME);
        }
        return true;
    }

    static boolean personValidate(PersonD personD) {
        if (personD == null) {
            throw new IllegalArgumentException(ExceptionMessages.NOT_VALID_CITIZEN);
        }
        return true;
    }

    static boolean personsListIsNotEmptyValidate(ArrayList<PersonD> personDSList) {
        if (personDSList.isEmpty()) {
            throw new IllegalArgumentException("Empty persons list.");
        }
        return true;
    }


}
