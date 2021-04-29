package BottleContent;

import java.util.Deque;

public class BottleOfWine extends Bottle<Wine> {
    public BottleOfWine() {
    }

    @Override
    public void fillLiquid(Wine liquid) {
        super.fillLiquid(liquid);
    }

    @Override
    public Deque<Wine> getLiquidContent() {
        return super.getLiquidContent();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
