package Pr02CarShopExtend;

import java.io.Serializable;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model, String color, Integer horsePower, String country, Double price) {
        // super(....);
        // e винаги над
        // this.price = price;
        super(model, color, horsePower, country);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        // Като извикам то стринг, ще извка то стринг на бащиният си клас чрез супер:
        String result = String.format("%s%n%s sells for %f", super.toString(), this.getModel(), this.getPrice());
        return result;
    }


}
