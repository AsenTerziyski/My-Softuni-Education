package Exercising.StudentSystem;

import Pr03StudentSystem.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private Map<String, StudentA> studentRep;

    public StudentRepository() {
        this.studentRep = new HashMap<>();
    }

    public void addStudent (StudentA student) {
        Validator.validateStudent(student);
        Validator.validateStudentExists(this.studentRep, student);
        this.studentRep.putIfAbsent(student.getName(), student);
    }

    public Map<String, StudentA> getStudentRep() {
        return this.studentRep;
    }
}
