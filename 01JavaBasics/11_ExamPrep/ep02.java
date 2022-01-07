package com.company;

import java.util.Scanner;

public class ep02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double fuelLitres = Double.parseDouble(scanner.nextLine());
        String saturdayOrSunday = scanner.nextLine();
        double totalPrice = fuelLitres * 2.10 + 100.00;
        if (saturdayOrSunday.equals("Saturday")) {
            totalPrice = totalPrice * 0.90;
        } else if (saturdayOrSunday.equals("Sunday")) {
            totalPrice = totalPrice * 0.80;
        }
        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Safari time! Money left: %.2f lv. ", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }
    }
}
