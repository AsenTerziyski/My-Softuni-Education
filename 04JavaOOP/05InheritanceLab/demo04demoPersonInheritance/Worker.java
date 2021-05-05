package demo04demoPersonInheritance;

public class Worker extends Person {
    private String company;
    private int workerID;

    public Worker(String name, int age, String company) {
        super(name, age);
        this.setCompany(company);
        this.workerID = super.personID;
    }

    public int getWorkerID() {
        return workerID;
    }

    private void setCompany(String company) {
        if (Validate.validateCompany(company)) {
            this.company = company;
        }
    }
}
