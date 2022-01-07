package com.company;

import java.util.Scanner;

public class exam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBagageLargerThanTwenty = Double.parseDouble(scanner.nextLine());
        double bagageKg = Double.parseDouble(scanner.nextLine());
        int daysTillTravel = Integer.parseInt(scanner.nextLine());
        int numberOfBagage = Integer.parseInt(scanner.nextLine());

        double priceBagage = 0.00;

        if (bagageKg < 10) {
            priceBagage = 0.20 * priceBagageLargerThanTwenty;
        } else if (bagageKg >=10 && bagageKg <= 20) {
            priceBagage = 0.50 * priceBagageLargerThanTwenty;
        } else if (bagageKg > 20) {
            priceBagage = priceBagageLargerThanTwenty;
        }

        if (daysTillTravel > 30) {
            priceBagage = priceBagage * 1.10;
        } else if (daysTillTravel >= 7 && daysTillTravel <=30) {
            priceBagage = priceBagage * 1.15;
        } else if (daysTillTravel < 7) {
            priceBagage = priceBagage * 1.40;
        }

        double totalSum = priceBagage * numberOfBagage;

        System.out.printf("The total price of bags is: %.2f lv. ", totalSum);
    }
}
