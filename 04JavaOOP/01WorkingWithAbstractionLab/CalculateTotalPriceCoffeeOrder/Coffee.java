package CalculateTotalPriceCoffeeOrder;

public enum Coffee {
    SMALL(1.50), MIDDLE(2.50), BIG(3.50);
    private double price;

    Coffee(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
