package com.company;

import java.util.Scanner;

public class nl02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int number = 0;
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int fourthDigit = 0;
        int fifthDigit = 0;
        int sixthDigit = 0;

        int sumOdd = 0;
        int sumEven = 0;


        for (number = firstNumber; number <= secondNumber; number++) {
            // System.out.println(i);
            firstDigit = number / 100000;
            // Примерно: 123456 / 100000 = 1,23456 = > 1;
            secondDigit = (number / 10000) % 10;
            // 123456 / 10 000 = 12,3456 = 12 % 10 = 10 + остатък 2 =>2
            thirdDigit = (number / 1000) % 10;
            fourthDigit = (number / 100) % 10;
            fifthDigit = (number / 10) % 10;
            // 123456 / 10 = 12345,6 => понеже е инт => 12345 % 10 = 5 (имаме остатък 5 );
            sixthDigit = number % 10;
            // 123456 % 10 = 123450 + остатък 6 => 6

            sumOdd = firstDigit + thirdDigit + fifthDigit;
            sumEven = secondDigit + fourthDigit + sixthDigit;

            if (sumEven == sumOdd) {
                System.out.print(number + " ");

            }
        }
    }
}
