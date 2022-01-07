package com.company;

import java.util.Scanner;

public class ep06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double parkingTax = 0.00;
        double totalSumPerDay = 0.00;
        double totalSumAllDays = 0.00;

        for (int i = 1; i <= days; i++) {
            parkingTax = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    parkingTax += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    parkingTax += 1.25;
                } else {
                    parkingTax += 1.00;
                }
            }
            totalSumPerDay = totalSumPerDay + parkingTax;
            System.out.printf("Day: %d - %.2f leva%n", i, totalSumPerDay);
            totalSumAllDays = totalSumAllDays + totalSumPerDay;
            totalSumPerDay = 0;
        }
        System.out.printf("Total: %.2f leva", totalSumAllDays);
    }
}

