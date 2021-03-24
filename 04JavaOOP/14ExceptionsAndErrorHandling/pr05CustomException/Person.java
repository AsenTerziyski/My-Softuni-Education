package pr05CustomException;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    private void setFirstName(String firstName) {
        validateString(firstName, "first name");
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        validateString(lastName, "last name");
        this.lastName = lastName;
    }

    private void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be in the range [1 ... 120]");
        }
        this.age = age;
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

    private void validateString(String str, String fieldName) {
        if (str == null || str.trim().isEmpty()) {
            throw new InvalidPersonNameException(String.format("The %s can not be null or empty", fieldName));
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isDigit(currentChar)) {
                throw new InvalidPersonNameException(String.format("The %s can not contain digit", fieldName));
            }
        }

    }

    @Override
    public String toString() {
        return "Valid person input";
    }
}
