package Exercising.StudentSystem;



import Pr03StudentSystem.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentA student0 = new StudentA("A", 10, 4);
        StudentA student1 = new StudentA("B", 12, 4);
        StudentA student2 = new StudentA("C", 13, 4);

        StudentRepository studentRep = new StudentRepository();
        studentRep.addStudent(student0);
        studentRep.addStudent(student1);
        studentRep.addStudent(student2);

        String name = scanner.nextLine();
        StudentPrinter.print(studentRep, name);

        //StudentA student3 = new StudentA("D", 100, 4);
    }
}
