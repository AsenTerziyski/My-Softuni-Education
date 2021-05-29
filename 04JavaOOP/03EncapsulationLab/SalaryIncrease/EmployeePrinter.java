package SalaryIncrease;

import java.util.List;

class EmployeePrinter {

    static void printEmployeeRecord (EmployeeRecord employeeRecord) {
        List<Person> employees = employeeRecord.getEmployees();
        for (Person employee : employees) {
            System.out.println(employee.toString());
        }

    }
}
