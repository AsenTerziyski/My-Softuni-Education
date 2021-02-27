package Pr03CardsWithPower;
//import Pr01CardSuit.CardSuite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String rankSuit = scanner.nextLine();

        Card card = new Card(
                CardRank.valueOf(cardRank.toUpperCase()),
                CardSuite.valueOf(rankSuit.toUpperCase())
        );

        System.out.println(card.toString());
    }
}
