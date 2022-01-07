package com.company;

import java.util.Scanner;

public class nl04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sumPresentation = 0.00;
        double averageGrade = 0.00;
        double sumAllPresentations = 0.00;
        int countAllMarks = 0;
        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            sumPresentation = 0.00;
            for (int i = 1; i <= n; i++) {
                double mark = Double.parseDouble(scanner.nextLine());
                sumPresentation = sumPresentation + mark;
                countAllMarks++;
            }
            sumAllPresentations = sumAllPresentations + sumPresentation;
            averageGrade = sumPresentation / n;
            System.out.printf("%s - %.2f.%n", input, averageGrade);
            input = scanner.nextLine();
        }
        double averageGradeAllPresentains = sumAllPresentations / countAllMarks;
        System.out.printf("Student's final assessment is %.2f.", averageGradeAllPresentains);
    }
}
