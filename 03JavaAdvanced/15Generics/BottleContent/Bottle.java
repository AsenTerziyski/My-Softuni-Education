package BottleContent;

import java.util.ArrayDeque;
import java.util.Deque;

public class Bottle<T> {
    private Deque<T> liquidContent;
    private T liquid;

    public Bottle() {
        this.liquidContent = new ArrayDeque<>();
    }

    public void fillLiquid(T liquid) {
        this.liquidContent.add(liquid);

    }

    public Deque<T> getLiquidContent() {
        Deque<T> liquidContent = this.liquidContent;
        return liquidContent;
    }

    @Override
    public String toString() {
        return "Bottle filled with" + this.getClass().getSimpleName();
    }
}
