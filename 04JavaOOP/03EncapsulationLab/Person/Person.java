package Person;

public class Person {
    protected String name;
    protected int age;
    protected int personID;
    static int ID = 0;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
        ID++;
        this.personID = ID;
    }

    private void setAge(int age) {
        if (age<=0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_AGE);
        }
        this.age = age;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NAME);
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person's name is: " + this.name +", his age is: " + this.age + ", and his personal ID is ID" + personID + ".";
    }
}
