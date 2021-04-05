package demo02;

public enum CoffeeSize {
    SMALL(50),
    MIDDLE(100),
    BIG(250);

    private int coffeeSize;

    CoffeeSize(int coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public int getCoffeeSize() {
        return coffeeSize;
    }
}
