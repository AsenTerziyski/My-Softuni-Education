package SalaryIncrease;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        EmployeeRecord employeeRecord = getEmployeeRecord(scanner, n);

        int percentBonus = Integer.parseInt(scanner.nextLine());

        increaseSalaries(employeeRecord, percentBonus);
        EmployeePrinter.printEmployeeRecord(employeeRecord);
    }

    private static void increaseSalaries(EmployeeRecord employeeRecord, int percentBonus) {
        for (Person e : employeeRecord.getEmployees()) {
            e.increaseSalary(percentBonus);
        }
    }

    private static EmployeeRecord getEmployeeRecord(Scanner scanner, int n) {
        EmployeeRecord employeeRecord = new EmployeeRecord();
        for (int i = 0; i <n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Person person = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
            employeeRecord.addPerson(person);
        }
        return employeeRecord;
    }
}
