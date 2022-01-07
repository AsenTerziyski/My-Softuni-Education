package com.company;

import java.util.Scanner;

public class wl02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfFails = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double currentMark = 0.00;
        String lastProblem = "";
        int count = 0;
        int countFailsCurrent = 0;
        double sumMarks = 0.00;

        while (!input.equals("Enough")) {
            currentMark = Double.parseDouble(scanner.nextLine());
            count++;
            lastProblem = input;
            sumMarks = sumMarks + currentMark;

            if (currentMark <= 4) {
                countFailsCurrent = countFailsCurrent + 1;
                if ((numberOfFails - countFailsCurrent) == 0) {
                    System.out.printf("You need a break, %d poor grades.", numberOfFails);
                    break;
                }
            }

            input = scanner.nextLine();

        }

        double averageScore = sumMarks / count;

        if (input.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", count);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
