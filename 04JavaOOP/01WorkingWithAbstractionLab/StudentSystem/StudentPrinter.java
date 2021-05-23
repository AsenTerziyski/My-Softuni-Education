package Exercising.StudentSystem;

import Pr03StudentSystem.Student;

import java.util.Map;

class StudentPrinter {

    static void print(StudentRepository studentRep, String name) {
        Map<String, StudentA> studentRep1 = studentRep.getStudentRep();
        if (studentRep1.containsKey(name)) {
            System.out.println(studentRep1.get(name));
        }
    }
}
