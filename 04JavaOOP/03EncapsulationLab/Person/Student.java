package Person;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.setSchool(school);
    }

    private void setSchool(String school) {
        if (school == null || school.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_SCHOOL_NAME);
        }
        this.school = school;
    }

    public void study () {
        System.out.println(String.format("Student %s with ID %d starts learning lessons.", this.name, this.personID));
    }

    @Override
    public String toString() {
        return super.toString() + " School: " + this.school + ".";
    }
}
