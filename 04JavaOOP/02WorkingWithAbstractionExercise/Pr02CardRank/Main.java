package Pr02CardRank;

//import Pr01CardSuit.CardSuite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        CardRank[] cardRanks = CardRank.values();
        System.out.println(input + ":");

        for (CardRank cardRank : cardRanks) {
            int ordinal = cardRank.ordinal();
            String name = cardRank.name();
            System.out.println(String.format("Ordinal value: %d; Name value: %s", ordinal, name));
        }
    }
}
