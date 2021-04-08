package bakery.entities.drinks;

import bakery.common.ExceptionMessages;
import bakery.entities.drinks.interfaces.Drink;

public abstract class BaseDrink implements Drink {
    private String name;
    private int portion;
    private double price;
    private String brand;

    protected BaseDrink(String name, int portion, double price, String brand) {
        this.setName(name);
        this.setPortion(portion);
        this.setPrice(price);
        this.setBrand(brand);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NAME);
        }
        this.name = name;
    }

    @Override
    public int getPortion() {
        return portion;
    }

    private void setPortion(int portion) {
        if (portion <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PORTION);
        }
        this.portion = portion;
    }

    @Override
    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PRICE);
        }
            this.price = price;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_BRAND);
        }
        this.brand = brand;
    }

    @Override
    public String toString() {
        //"{current drink name} {current brand name} - {current portion}ml - {current price - formatted to the second digit}lv"
        return String.format("%s %s - %dml - %.2flv",
                this.name,
                this.brand,
                this.portion,
                this.price);
    }
}
