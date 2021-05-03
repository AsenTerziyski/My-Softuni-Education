package CalculateTotalPriceCoffeeOrder;

public class CalculateCoffeePrice {
    private Coffee coffee;
    private int number;
    private double price;

    public CalculateCoffeePrice(Coffee coffee, int number) {
        this.coffee = coffee;
        this.number = number;
    }

    public double getTotalPrice() {
        return this.price = coffee.getPrice() * number;
    }
}
