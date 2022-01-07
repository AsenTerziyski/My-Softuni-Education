package com.company;

import java.util.Scanner;

public class wl08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer neededSum = Integer.parseInt(scanner.nextLine());


        int countCurrentPay = 0;
        int cuurentSum = 0;
        int totalPayWithCard = 0;
        int cardPaymants = 0;
        int totalPayKesh = 0;
        int keshPaymants = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int priceProduct = Integer.parseInt(input);
            countCurrentPay++;

            if (countCurrentPay % 2 == 1) {
                if (priceProduct > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    keshPaymants++;
                    totalPayKesh = totalPayKesh + priceProduct;
                    cuurentSum = cuurentSum + priceProduct;
                }
            } else {
                if (priceProduct < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cardPaymants++;
                    totalPayWithCard = totalPayWithCard + priceProduct;
                    cuurentSum = cuurentSum + priceProduct;
                }
            }

            if (cuurentSum >= neededSum) {
                System.out.printf("Average CS: %.2f%n", 1.00 * totalPayKesh / keshPaymants);
                System.out.printf("Average CC: %.2f", 1.00 * totalPayWithCard / cardPaymants);
                break;
            }

            input = scanner.nextLine();

        }

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
