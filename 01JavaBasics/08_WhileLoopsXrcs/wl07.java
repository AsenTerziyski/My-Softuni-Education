package com.company;

import java.util.Scanner;

public class wl07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBottles = Integer.parseInt(scanner.nextLine());
        int volumeTotal = numberOfBottles * 750;

        int count = 0;
        int countDishes = 0;
        int countPots = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int n = Integer.parseInt(input);
            count++;
            if (count % 3 == 0) {
                countPots = countPots + n;
                volumeTotal = volumeTotal - n * 15;
            } else {
                countDishes = countDishes + n;
                volumeTotal = volumeTotal - n * 5;
            }
            if (volumeTotal < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(volumeTotal));
                break;
            }
            input = scanner.nextLine();
        }
        if (volumeTotal >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", countDishes, countPots);
            System.out.printf("Leftover detergent %d ml.", volumeTotal);
        }
    }
}
