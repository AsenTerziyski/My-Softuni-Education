package com.company;

import java.util.Scanner;

public class exam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameAviationCompany = scanner.nextLine();
        int numberTicketsAdult = Integer.parseInt(scanner.nextLine());
        int numberTicketsChild = Integer.parseInt(scanner.nextLine());
        double netPriceTicketAdult = Double.parseDouble(scanner.nextLine());
        double priceObsluzvvane = Double.parseDouble(scanner.nextLine());

        double netPriceTicketChild = 0.30 * netPriceTicketAdult;

        double priceTicketAdult = netPriceTicketAdult + priceObsluzvvane;
        double priceTicketChild = netPriceTicketChild + priceObsluzvvane;

        double totalRevenue = priceTicketAdult * numberTicketsAdult + priceTicketChild * numberTicketsChild;

        double totalProfit = totalRevenue * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameAviationCompany, totalProfit);

    }
}
