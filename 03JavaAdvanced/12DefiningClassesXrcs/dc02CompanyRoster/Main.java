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
            String currentName = tokens[0];
            double currentSalary = Double.parseDouble(tokens[1]);
            String currentPosition = tokens[2];
            String currentDepartment = tokens[3];

            Employee currentEmployee = null;
            Department currentDepartmentObject = new Department();
            //от тук ми идаше грешката:
            currentDepartmentObject.setEmployeeList(new ArrayList<>());

            departmentMap.putIfAbsent(currentDepartment, currentDepartmentObject);

            if (tokens.length == 4) {
                currentEmployee = new Employee(currentName, currentSalary, currentPosition, currentDepartment);

            } else if (tokens.length == 5) {

                if (tokens[4].matches("^\\d+$")) {
                    int currentAge = Integer.parseInt(tokens[4]);
                    currentEmployee = new Employee(currentName, currentSalary, currentPosition, currentDepartment, currentAge);

                } else {
                    String currentEmail = tokens[4];
                    currentEmployee = new Employee(currentName, currentSalary, currentPosition, currentDepartment, currentEmail);

                }

            } else if (tokens.length == 6) {

                String currentEmail = tokens[4];
                int currentAge = Integer.parseInt(tokens[5]);
                currentEmployee = new Employee(currentName, currentSalary, currentPosition, currentDepartment, currentEmail, currentAge);

            }

            departmentMap
                    .get(currentDepartment)
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


        Department bestDepartmentObject = departmentMap.get(bestDepartment);
        bestDepartmentObject
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
