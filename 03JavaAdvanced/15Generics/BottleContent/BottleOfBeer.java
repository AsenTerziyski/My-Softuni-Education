package BottleContent;

import java.util.Deque;

public class BottleOfBeer extends Bottle<Beer> {
    public BottleOfBeer() {
        super();
    }

    @Override
    public void fillLiquid(Beer liquid) {
        super.fillLiquid(liquid);
    }

    @Override
    public Deque<Beer> getLiquidContent() {
        return super.getLiquidContent();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
