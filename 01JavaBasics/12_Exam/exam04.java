package com.company;

import java.util.Scanner;

public class exam04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int points = 0;

        int pointsRed = 0;
        int countRed = 0;
        int pointsOrange = 0;
        int countOrange = 0;
        int pointsYellow = 0;
        int countYellow = 0;
        int pointsWhite = 0;
        int countWhite = 0;
        int countBlack = 0;
        int countDefault = 0;


        for (int i = 1; i <= n; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    countRed++;
                    pointsRed = 5;
                    points = points + pointsRed;
                    break;
                case "orange":
                    countOrange++;
                    pointsOrange = 10;
                    points = points + pointsOrange;
                    break;
                case "yellow":
                    countYellow++;
                    pointsYellow = 15;
                    points = pointsYellow + points;
                    break;
                case "white":
                    countWhite++;
                    pointsWhite = 20;
                    points = points + pointsWhite;
                    break;
                case "black":
                    countBlack++;
                    points = points / 2;
                    break;
                default:
                    countDefault++;
            }

        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Points from red balls: %d%n", countRed);
        System.out.printf("Points from orange balls: %d%n", countOrange);
        System.out.printf("Points from yellow balls: %d%n", countYellow);
        System.out.printf("Points from white balls: %d%n", countWhite);
        System.out.printf("Other colors picked: %d%n", countDefault);
        System.out.printf("Divides from black balls: %d", countBlack);
    }
}
