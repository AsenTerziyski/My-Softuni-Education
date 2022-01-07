package com.company;

import java.util.Scanner;

public class exam05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfPlayer = scanner.nextLine();
        String nameOfBestPlayer = "";
        int maxGoal = Integer.MIN_VALUE;

        while (!nameOfPlayer.equals("END")) {
            int numbGoals = Integer.parseInt(scanner.nextLine());
            if (maxGoal < numbGoals) {
                maxGoal = numbGoals;
                nameOfBestPlayer = nameOfPlayer;
                if (maxGoal >= 10) {
                    break;
                }
            }
            nameOfPlayer = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", nameOfBestPlayer);

        if (maxGoal >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", maxGoal);
        } else if (maxGoal < 3) {
            System.out.printf("He has scored %d goals.%n", maxGoal);
        }
    }
}
