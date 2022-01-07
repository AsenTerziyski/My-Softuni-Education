package com.company;

import java.util.Scanner;

public class wl03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int daysToSpend = 0;
        int daysToSave = 0;
        int totalDays = 0;

        while (ownedMoney < neededMoney) {
            String input = scanner.nextLine();
            double currentSum = Double.parseDouble(scanner.nextLine());
            totalDays++;
            if (input.equals("save")) {
                ownedMoney = ownedMoney + currentSum;
                daysToSave = daysToSave + 1;
                daysToSpend = 0;
            }
            if (input.equals("spend")) {
                ownedMoney = ownedMoney - currentSum;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
                daysToSpend = daysToSpend + 1;
                if (daysToSpend == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(totalDays);
                    break;
                }
            }
        }
        if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
