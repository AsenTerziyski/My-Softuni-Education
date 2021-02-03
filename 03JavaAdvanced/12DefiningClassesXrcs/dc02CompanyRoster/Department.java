package dc02CompanyRoster;

import java.util.Collections;
import java.util.List;

public class Department {
    private List<Employee> employeeList;

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public double getAverageSalary () {
        double sum = 0.00;
        for (Employee employee : employeeList) {
            sum+=employee.getSalary();
        }
        return sum/employeeList.size();
    }

}
