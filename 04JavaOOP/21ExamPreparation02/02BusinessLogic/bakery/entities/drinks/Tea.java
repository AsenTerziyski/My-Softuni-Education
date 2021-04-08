package bakery.entities.drinks;

public class Tea extends BaseDrink {
    //The Tea has constant value for teaPrice – 2.50
    private static final double TEA_PRICE = 2.50;

    public Tea(String name, int portion, String brand) {
        super(name, portion, TEA_PRICE, brand);
    }
}
