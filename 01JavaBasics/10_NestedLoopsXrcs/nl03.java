package com.company;

import java.util.Scanner;

public class nl03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            // брояч на делителите:
            int count = 0;
            // алгоритъм за проверка на едно число дали е просто или съставно: ако е просто се дели
            // само на себе си или на едно. Значи в интервала от едно до самото число има само два делителя,
            // които дават остатък нула - самото число и единица!!!!
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sumPrimeNumbers = sumPrimeNumbers + number;
            } else if (count > 2) {
                sumNonPrimeNumbers = number + sumNonPrimeNumbers;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumbers);
    }
}
