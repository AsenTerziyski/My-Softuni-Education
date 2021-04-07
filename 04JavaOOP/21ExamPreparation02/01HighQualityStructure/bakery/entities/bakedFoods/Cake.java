package bakery.entities.bakedFoods;

public class Cake extends BaseFood {
    //The Cake has constant value for InitialBreadPortion - 245
    private static final double INITIAL_CAKE_PORTION = 245;

    public Cake(String name, double price) {
        super(name, INITIAL_CAKE_PORTION, price);
    }
}
