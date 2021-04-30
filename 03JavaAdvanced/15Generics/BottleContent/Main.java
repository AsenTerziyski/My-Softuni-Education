package BottleContent;

import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Bottle bottleOfBeer = new BottleOfBeer();
        Bottle bottleOfWine = new BottleOfWine();
        int totalWineBottles = 0;
        int totalBeerBottles = 0;

        while (!input.equalsIgnoreCase("enD")) {
            String[] tokens = input.split("\\s+");
            String wineOrBeer = tokens[0];
            String brand = tokens[1];
            switch (wineOrBeer) {
                case "wine":
                    bottleOfWine.fillLiquid(new Wine(brand));
                    System.out.println(String.format("Filled wine, brand %s in the bottle No%d", brand, Wine.getWineBottleCount()));
                    totalWineBottles++;
                    break;
                case "beer":
                    bottleOfBeer.fillLiquid(new Beer(brand));
                    System.out.println(String.format("Filled beer, brand %s in the bottle No%d", brand, Beer.getBeerBottleCount()));
                    totalBeerBottles++;
                    break;
                default:
                    throw new IllegalArgumentException("Liquid must be beer or wine!");
            }

            input = scanner.nextLine();
        }

        System.out.println();
        System.out.println("Filling successful!");
        if (Beer.getBeerBottleCount() > 0) {
            System.out.println(String.format("Total filled beer bottles = %d", totalBeerBottles));
        } else {
            System.out.println("No beer bottles!");
        }

        if (Wine.getWineBottleCount() > 0) {
            System.out.println(String.format("Total tilled wine bottles = %d", totalWineBottles));
        } else {
            System.out.println("No wine bottles!");
        }

        System.out.println(String.format("Total bottles filled: %d", totalBeerBottles + totalWineBottles));

    }

    static {
        System.out.println("Start filling bottles with Wine or Beer \"( format beer interval brand )\":");
    }


}
