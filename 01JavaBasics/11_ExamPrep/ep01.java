package com.company;

import java.util.Scanner;

public class ep01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        double totalPrice = 1.20 * (chickenMenu * 10.35 + fishMenu * 12.40 + veganMenu * 8.15);
        double totalPrivePlusDelivery = totalPrice + 2.50;
        System.out.printf("Total: %.2f", totalPrivePlusDelivery);
    }
}
