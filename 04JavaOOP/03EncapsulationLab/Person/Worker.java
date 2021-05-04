package Person;

public class Worker extends Person {
    private String company;
    private double salary;

    public Worker(String name, int age, String company) {
        super(name, age);
        this.setCompany(company);
    }

    void setSalary (double salary) {
        if (this.age >=50) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_SALARY);
        }
        if (salary<=0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_SALARY_ZERO);
        }
        this.salary = salary;
    }

    void printSalary () {
        System.out.println(String.format("Worker with name %s and ID%d has salary %.2f!", this.name, this.personID, this.salary));
    }

    private void setCompany(String company) {
        if (company == null || company.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_COMPANY_NAME);
        }
        this.company = company;
    }
    public String work (String job) {
        return String.format("Worker %s and ID%d starts working job %s.", this.name, this.personID, job);
    }

    @Override
    public String toString() {
        return super.toString() + " Company: " + this.company;
    }
}
