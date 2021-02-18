package bakery;

import java.util.ArrayList;

public class Bakery {
    //•	name: String
    //•	capacity: int
    private ArrayList<Employee> employees = new ArrayList<>();
    private String name;
    private int capacity;
//
//    public Bakery(ArrayList<Employee> employees, String name) {
//        this.employees = employees;
//        this.name = name;
//        this.employees = new ArrayList<>();
//    }


    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        if (this.employees.size() <= capacity) {
            this.employees.add(employee);
        }
    }

    public boolean remove(String name) {
        int indexToRemove = -1;
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getName().equals(name)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            this.employees.remove(indexToRemove);
            return true;
        }
        return false;
    }

    public Employee getOldestEmployee() {
        Employee oldestEmployee = null;
        int oldest = -1;
        for (int i = 0; i < this.employees.size(); i++) {
            int currentAge = this.employees.get(i).getAge();
            if (currentAge > oldest) {
                oldest = currentAge;
                oldestEmployee = this.employees.get(i);
            }
        }
        return oldestEmployee;
    }

    public Employee getEmployee(String name) {
        Employee employee = null;
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getName().equals(name)) {
                employee = this.employees.get(i);
            }
        }
        return employee;
    }

    public int getCount() {
        int countEmployees = this.employees.size();
        return countEmployees;
    }

    public String report () {
        String output = String.format("Employees working at Bakery %s:", this.name);
        StringBuilder sb = new StringBuilder();
        sb.append(output).append(System.lineSeparator());
        for (int i = 0; i <this.employees.size(); i++) {
            Employee currentEmployee = this.employees.get(i);
            sb.append(currentEmployee).append(System.lineSeparator());
        }
        output = sb.toString().trim();
        return output;
    }
}
