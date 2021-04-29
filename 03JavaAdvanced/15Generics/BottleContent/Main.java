package BottleContent;

import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        BottleOfBeer bottleOfBeer = new BottleOfBeer();
        bottleOfBeer.fillLiquid(new Beer("Shumensko"));
        bottleOfBeer.fillLiquid(new Beer("Lomsko"));
        bottleOfBeer.fillLiquid(new Beer("Zagorka"));

        BottleOfWine bottleOfWine = new BottleOfWine();
        bottleOfWine.fillLiquid(new Wine("Wine1"));
        bottleOfWine.fillLiquid(new Wine("Wine2"));
        bottleOfWine.fillLiquid(new Wine("Wine3"));

        Deque<Beer> beers = bottleOfBeer.getLiquidContent();
        for (Beer beer : beers) {
            System.out.println(beer);
        }

        System.out.println("x                              x");

        Deque<Wine> wines = bottleOfWine.getLiquidContent();
        for (Wine wine : wines) {
            System.out.println(wine);
        }


    }
}
