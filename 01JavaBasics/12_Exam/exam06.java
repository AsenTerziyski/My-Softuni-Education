package com.company;

import java.util.Scanner;

public class exam06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        int firstDigitOne = numOne / 1000;
        int secondDigitOne = numOne / 100 % 10;
        int thirdDigitOne = numOne / 10 % 10;
        int fourthDigitOne = numOne % 10;

        int firstDigitTwo = numTwo / 1000;
        int secondDigitTwo = numTwo / 100 % 10;
        int thirdDigitTwo = numTwo / 10 % 10;
        int fourthDigitTwo = numTwo % 10;

        for (int i = firstDigitOne; i <= firstDigitTwo; i++) {
            for (int j = secondDigitOne; j <= secondDigitTwo; j++) {
                for (int a = thirdDigitOne; a <= thirdDigitTwo; a++) {
                    for (int b = fourthDigitOne; b <= fourthDigitTwo; b++) {
                        if (i % 2 == 1 && j % 2 == 1 && a % 2 == 1 && b % 2 == 1) {
                            System.out.printf("%d%d%d%d ", i, j, a, b);
                        }
                    }
                }
            }
        }
    }
}
