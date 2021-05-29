package SalaryIncrease;

import java.util.List;

class Validator {

    static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExcMsg.notValidName);
        }

    }


    static void validateAge(int age) {
        if (age<=0 || age>=85) {
            throw new IllegalArgumentException(ExcMsg.notValidAge);
        }

    }


    static void validateSalary(double salary) {
        if (salary<=650) {
            throw new IllegalArgumentException(ExcMsg.notValidSalary);
        }

    }


    static double returnPercentage(int percentage, int age) {
        if (age < 30) {
            return 1.00 * percentage / 2;
        } else {
            return 1.00 * percentage;
        }
    }

    static void validatePerson(Person person) {
        if (person == null) {
            throw new IllegalArgumentException(ExcMsg.notValidPerson);
        }
    }


    static void validatePersonExists(List<Person> employees, Person person) {
        if (!employees.contains(person)) {
            throw new IllegalArgumentException(ExcMsg.personIsNotInEmployeeRecord);
        }
    }

    static void validateEmployeeRecordIsNotEmpty(List<Person> employees) {
        if (employees.isEmpty()) {
            throw new IllegalArgumentException(ExcMsg.noEmployees);
        }
    }
}
