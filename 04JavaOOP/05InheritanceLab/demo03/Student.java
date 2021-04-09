package demo03;

public class Student extends Person {
    private String school;
    private String name;

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    public void study() {
        System.out.println("This " + this.getClass().getSimpleName() + " with name " + super.name + "start reading!");
    }
}
