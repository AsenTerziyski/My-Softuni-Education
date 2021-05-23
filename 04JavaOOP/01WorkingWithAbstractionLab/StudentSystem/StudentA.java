package Exercising.StudentSystem;

public class StudentA {
    private String studentName;
    private int studentAge;
    private double studentGrade;

    public StudentA() {
    }

    public StudentA(String studentName, int studentAge, double studentGrade) {
        this.setStudentName(studentName);
        this.setStudentAge(studentAge);
        this.setStudentGrade(studentGrade);
    }

    private void setStudentName(String studentName) {
        Validator.validateStudentName(studentName);
        this.studentName = studentName;
    }

    private void setStudentAge(int studentAge) {
        Validator.validateStudentAge(studentAge);
        this.studentAge = studentAge;
    }

    private void setStudentGrade(double studentGrade) {
        boolean b;
        if (Validator.validateStudentGrade(studentGrade)) b = true;
        else b = false;
        this.studentGrade = studentGrade;
    }

    @Override
    public String toString() {
        String s = Validator.validateExcellentStudent(this.studentGrade);
        return String.format("%s is %d years old. %s student. His grade is %.2f.", this.studentName, this.studentAge, s, this.studentGrade);
    }

    public String getName() {
        return this.studentName;
    }
}
