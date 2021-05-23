package Exercising.StudentSystem;

import Pr03StudentSystem.Student;

import java.util.Map;

public class Validator {

    static boolean validateStudentName(String studentName) {
        if (studentName == null || studentName.isEmpty()) {
            throw new IllegalArgumentException(Messages.notValidStudentName);
        }
        return true;
    }

    static boolean validateStudentAge(int studentAge) {
        if (studentAge<=6 || studentAge>18) {
            throw new IllegalArgumentException(Messages.notValidStudentAge);
        }

        return true;
    }

    static boolean validateStudentGrade(double studentGrade) {
        if (studentGrade<=3 && studentGrade>=6) {
            throw new IllegalArgumentException(Messages.notValidGrade);
        }
        return true;
    }

    static String  validateExcellentStudent(double studentGrade) {
        if (studentGrade>=5.50) {
            return "Excellent";
        } else {
            return "Average";
        }
    }

    public static void validateStudent(StudentA student) {
        if (student == null) {
            throw new IllegalArgumentException(Messages.notValidStudent);
        }
    }

    public static void validateStudentExists(Map<String, StudentA> studentRep, StudentA student) {
        if (studentRep.containsKey(student.getName()))
            throw new IllegalArgumentException(Messages.studentExists);
    }
}
