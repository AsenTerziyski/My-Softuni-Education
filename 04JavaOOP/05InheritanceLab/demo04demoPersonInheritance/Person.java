package demo04demoPersonInheritance;

public class Person {
    protected String name;
    protected int age;
    private static int ID = 0;
    protected int personID;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
        ID++;
        this.personID = ID;
    }

    private void setName(String name) {
        if (Validate.validateName(name)) {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (Validate.validateAge(age)) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "This " + this.getClass().getSimpleName().toLowerCase()
                + " is with name: " + this.name
                + ", age:" + this.age
                + ", ID:" + this.personID;
    }
}
