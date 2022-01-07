package com.company;

import java.util.Scanner;

public class exam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDogrami = Integer.parseInt(scanner.nextLine());
        String typeDogrami = scanner.nextLine();
        String typeOfDelivery = scanner.nextLine();

        double pricePerArticle = 0;

        switch (typeDogrami) {
            case "90X130":
                pricePerArticle = 110;
                if (numDogrami > 30 && numDogrami <= 60) {
                    pricePerArticle = pricePerArticle * 0.95;
                } else if (numDogrami > 60) {
                    pricePerArticle = pricePerArticle * 0.92;
                }
                break;
            case "100X150":
                pricePerArticle = 140;
                if (numDogrami > 40 && numDogrami <= 80) {
                    pricePerArticle = pricePerArticle * 0.94;
                } else if (numDogrami > 80) {
                    pricePerArticle = pricePerArticle * 0.90;
                }
                break;
            case "130X180":
                pricePerArticle = 190;
                if (numDogrami > 20 && numDogrami <= 50) {
                    pricePerArticle = pricePerArticle * 0.93;
                } else if (numDogrami > 50) {
                    pricePerArticle = pricePerArticle * 0.88;
                }
                break;
            case "200X300":
                pricePerArticle = 250;

                if (numDogrami > 25 && numDogrami <= 50) {
                    pricePerArticle = pricePerArticle * 0.91;
                } else if (numDogrami > 50) {
                    pricePerArticle = pricePerArticle * 0.86;
                }
                break;
        }

        double totalSum = numDogrami * pricePerArticle;

        if (typeOfDelivery.equals("With delivery")) {
            totalSum = totalSum + 60.00;
        } else if (typeOfDelivery.equals("Without delivery")) {
            totalSum = totalSum;
        }

        if (numDogrami > 99) {
            totalSum = totalSum*0.96;
        }

        if (numDogrami < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", totalSum);
        }


    }
}
