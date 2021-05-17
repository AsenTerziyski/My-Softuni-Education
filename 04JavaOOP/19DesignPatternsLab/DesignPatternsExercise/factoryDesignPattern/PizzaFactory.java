package factoryDesignPattern;

public class PizzaFactory {
    public Pizza createPizza(PizzaType type, int diameter) {
        Pizza pizza = null;
        switch (type) {
            case ITALIAN:
                pizza = new ItalianPizza(diameter);
                break;
            case CHEESE:
                pizza = new CheesePizza(diameter);
                break;
            case MEAT:
                pizza = new MeatPizza(diameter);
                break;
            default:
                throw new IllegalArgumentException("Not Valid Type Pizza!");
        }

        return pizza;
    }
}
