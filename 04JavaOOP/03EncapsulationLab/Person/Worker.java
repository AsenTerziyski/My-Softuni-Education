package Person;

public class Worker extends Person {
    private String company;

    public Worker(String name, int age, String company) {
        super(name, age);
        this.setCompany(company);
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
