package dc02CompanyRoster;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            Employee currentEmployee = null;
            Department departmentObj = new Department();
            departmentObj.setEmployeeList(new ArrayList<>());
            departmentMap.putIfAbsent(department, departmentObj);

            if (tokens.length == 4) {
                currentEmployee = new Employee(name, salary, position, department);
            } else if (tokens.length == 5) {
                if (tokens[4].matches("^\\d+$")) {
                    int age = Integer.parseInt(tokens[4]);
                    currentEmployee = new Employee(name, salary, position, department, age);
                } else {
                    String email = tokens[4];
                    currentEmployee = new Employee(name, salary, position, department, email);
                }
            } else if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                currentEmployee = new Employee(name, salary, position, department, email, age);
            }

            departmentMap
                    .get(department)
                    .getEmployeeList()
                    .add(currentEmployee);

        }

        double highestSalary = Integer.MIN_VALUE;
        String bestDepartment = "";

        for (Map.Entry<String, Department> entry : departmentMap.entrySet()) {
            if (highestSalary < entry.getValue().getAverageSalary()) {
                highestSalary = entry.getValue().getAverageSalary();
                bestDepartment = entry.getKey();
            }
        }

        System.out.println(String.format("Highest Average Salary: %s", bestDepartment));
        Department department = departmentMap.get(bestDepartment);

        department
                .getEmployeeList()
                .stream()
                .sorted((f, s) -> {

                    double firstSalary = f.getSalary();
                    double secondSalary = s.getSalary();
                    return Double.compare(secondSalary, firstSalary);
                })
                .forEach(s -> System.out.println(s));

    }
}
