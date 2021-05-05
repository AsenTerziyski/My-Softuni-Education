package demo04demoPersonInheritance;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.setSchool(school);
    }

    private void setSchool(String school) {
        if (Validate.validateSchoolName(school)) {
            this.school = school;
        }
    }

    public void studyLesson(String lesson) {
        System.out.println(this.getClass().getSimpleName() + " " + super.name + " starts learning " + lesson + ".");
    }

    @Override
    public String toString() {
        return super.toString() + " is from school " + this.school + ".";
    }
}
