package com.company;

import java.util.Scanner;

public class ep05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                p1++;
            }
            if (num % 3 == 0) {
                p2++;
            }
            if (num % 4 == 0) {
                p3++;
            }
        }
        double percentOne = 100.00 * p1 / n;
        double percentTwo = 100.00 * p2 / n;
        double percentThree = 100.00 * p3 / n;
        System.out.printf("%.2f%%%n", percentOne);
        System.out.printf("%.2f%%%n", percentTwo);
        System.out.printf("%.2f%%%n", percentThree);
    }
}
