package demo03;

public class Worker extends Person {
    private String company;

    public Worker(String name, String company) {
        super(name);
        this.company = company;
    }

    public void work() {
        System.out.println("This " + this.getClass().getSimpleName() + " with name " + super.name + " start working!");
    }
}
