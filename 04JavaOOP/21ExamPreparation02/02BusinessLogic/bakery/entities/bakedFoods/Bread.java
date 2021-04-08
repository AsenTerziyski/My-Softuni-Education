package bakery.entities.bakedFoods;

public class Bread extends BaseFood {

    // с команда const => genriram dolniya red!!!
    private static final double INITIAL_BREAD_PORTION = 200;

    public Bread(String name, double price) {
        super(name, INITIAL_BREAD_PORTION, price);
    }
}
