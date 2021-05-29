package SalaryIncrease;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeRecord {
    List<Person> employees;

    public EmployeeRecord() {
        employees = new ArrayList<>();
    }

    void addPerson(Person person) {
        Validator.validatePerson(person);
        this.employees.add(person);
    }

    void removePerson(Person person) {
        Validator.validatePerson(person);
        Validator.validateEmployeeRecordIsNotEmpty(this.employees);
        Validator.validatePersonExists(this.employees, person);
        this.employees.remove(person);
    }

    List<Person> getEmployees() {
        List<Person> people = Collections.unmodifiableList(this.employees);
        return people;
    }
}
