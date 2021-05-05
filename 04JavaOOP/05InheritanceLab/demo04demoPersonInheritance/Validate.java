package demo04demoPersonInheritance;

public class Validate {

    static boolean validateAge(int age) {
        if (age <= 0 || age >= 100) {
            throw new IllegalArgumentException(PersonExceptionMessages.INVALID_AGE);
        }
        return true;
    }

    static boolean validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(PersonExceptionMessages.INVALID_NAME);
        }
        return true;
    }

    static boolean validateSchoolName(String school) {
        if (school == null || school.trim().isEmpty()) {
            throw new IllegalArgumentException(PersonExceptionMessages.INVALID_SCHOOL_NAME);
        }
        return true;
    }

    static boolean validateCompany(String company) {
        if (company == null || company.trim().isEmpty()) {
            throw new IllegalArgumentException(PersonExceptionMessages.INVALID_COMPANY_NAME);
        }
        return true;
    }

    static boolean validatePersonIsNotNull(Person person) {
        if (person != null) {
            return true;
        } else {
            throw new IllegalArgumentException(PersonExceptionMessages.PERSON_CANT_BE_NULL);
        }
    }
}
