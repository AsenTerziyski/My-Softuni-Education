package com.company;

import java.util.Scanner;

public class wl10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int totalsum = 0;

        while (i<=n) {
            int num = Integer.parseInt(scanner.nextLine());
            totalsum = totalsum + num;
            i++;
        }

        double average = 1.00* totalsum / n;
        System.out.printf("%.2f", average);
    }
}
