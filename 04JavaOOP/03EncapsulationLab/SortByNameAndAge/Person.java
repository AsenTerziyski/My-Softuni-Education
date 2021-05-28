package SortByNameAndAge;

public class Person {
// firstName: String
//•	lastName: String
//•	age: int

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setlastName(lastName);
        this.setAge(age);
    }

    private void setAge(int age) {
        Validator.validateAge(age);
        this.age = age;
    }

    private void setlastName(String lastName) {
        Validator.validateName(lastName);
        this.lastName = lastName;
    }

    private void setFirstName(String firstName) {
        Validator.validateName(firstName);
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old", this.firstName, this.lastName, this.age);
    }
}
