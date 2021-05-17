package factoryDesignPattern;

public class Main {
    public static void main(String[] args) {

        Pizzeria pizzeria = new Pizzeria(new PizzaFactory());
        Pizza pizza = pizzeria.orderPizza(PizzaType.CHEESE, 30);
        Pizza pizza1 = pizzeria.orderPizza(PizzaType.MEAT, 50);
    }


}
