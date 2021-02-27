package Pr01CardSuit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        CardSuite[] values = CardSuite.values();
        System.out.println(input);
//        for (int i = 0; i <values.length; i++) {
//            System.out.println(String.format("Ordinal value: %d; Name value: %s", i, values[i]));
//        }
        for (CardSuite cardSuite : values) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", cardSuite.ordinal(), cardSuite.name()));
        }
    }
}
