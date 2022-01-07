package com.company;

import java.util.Scanner;

public class wl04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = 0;
        while (steps <= 10000) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                int stepsHome = Integer.parseInt(scanner.nextLine());
                int stepsHomeTotal = stepsHome + steps;
                int diffHome = (stepsHomeTotal - 10000);
                if (diffHome < 0) {
                    System.out.printf("%d more steps to reach goal.", Math.abs(diffHome));
                } else {
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!", Math.abs(diffHome));
                }
                break;
            }
            int currentSteps = Integer.parseInt(input);
            steps = steps + currentSteps;
        }
        if (steps > 10000) {
            int diff = steps - 10000;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        }
    }
}
