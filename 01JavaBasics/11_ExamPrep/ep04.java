package com.company;

import java.util.Scanner;

public class ep04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String productType = scanner.nextLine();
        int countPurchasedProducts = 0;
        int countOrder = 0;
        double totalSum = 0.00;
        while (!productType.equals("Stop")) {
            countOrder++;
            double productPrice = Double.parseDouble(scanner.nextLine());

            if (countOrder % 3 == 0) {
                productPrice = productPrice / 2.00;
            }
            if (productPrice > budget) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", productPrice - budget);
                break;
            }
            budget = budget - productPrice;
            totalSum = totalSum + productPrice;
            countPurchasedProducts++;
            productType = scanner.nextLine();
        }
        if (productType.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", countPurchasedProducts, totalSum);
        }
    }
}
