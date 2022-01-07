package com.company;

import java.util.Scanner;

public class ep03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractPeriod = scanner.nextLine();
        String contractType = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double tax = 0.00;
        double totalSum = 0.00;

        switch (contractType) {
            case "Small":
                switch (contractPeriod) {
                    case "one":
                        tax = 9.98;
                        break;
                    case "two":
                        tax = 8.58;
                        break;
                }
                break;
            case "Middle":
                switch (contractPeriod) {
                    case "one":
                        tax = 18.99;
                        break;
                    case "two":
                        tax = 17.09;
                        break;
                }
                break;
            case "Large":
                switch (contractPeriod) {
                    case "one":
                        tax = 25.98;
                        break;
                    case "two":
                        tax = 23.59;
                        break;
                }
                break;
            case "ExtraLarge":
                switch (contractPeriod) {
                    case "one":
                        tax = 35.99;
                        break;
                    case "two":
                        tax = 31.79;
                        break;
                }
                break;
        }

        switch (mobileInternet) {
            case "yes":
                if (tax <=10.00) {
                    tax = tax + 5.50;
                } else if (tax <= 30.00) {
                    tax = tax + 4.35;
                } else {
                    tax = tax + 3.85;
                }
                break;
            case "no":
                break;
        }
        totalSum = tax * months;
        if (contractPeriod.equals("two")) {
            totalSum = totalSum * (1.00 - 3.75/100);
        }
        System.out.printf("%.2f lv.", totalSum);
    }
}
