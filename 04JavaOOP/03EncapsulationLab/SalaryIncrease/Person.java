package SalaryIncrease;

public class Person implements IPerson {
    private String firstName;
    private String lasName;
    private int age;
    private double salary;

    public Person(String firstName, String lasName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLasName(lasName);
        this.setAge(age);
        this.setSalary(salary);
    }

    private void setSalary(double salary) {
        Validator.validateSalary(salary);
        this.salary = salary;
    }

    private void setAge(int age) {
        Validator.validateAge(age);
        this.age = age;
    }

    private void setLasName(String lasName) {
        Validator.validateName(firstName);
        this.lasName = lasName;
    }

    private void setFirstName(String firstName) {
        Validator.validateName(firstName);
        this.firstName = firstName;
    }

    @Override
    public double increaseSalary(int percentage) {
        double percentageBonus = Validator.returnPercentage(percentage, this.age);
        this.salary = this.salary + this.salary * percentage * 1.00 / 100;
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva after increasing salary!", this.firstName, this.lasName, this.salary);
    }

    public double getSalary() {
        return salary;
    }
}
