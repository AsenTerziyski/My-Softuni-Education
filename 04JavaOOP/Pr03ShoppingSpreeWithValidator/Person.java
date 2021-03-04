package Pr03ShoppingSpreeWithValidator;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        Validator.validateName(name);
//        if (name == null || name.trim().isEmpty()) {
//            throw new IllegalArgumentException("Name cannot be empty");
//        }
        this.name = name;
    }

    private void setMoney(double money) {
        Validator.validateMoney(money);
//        if (money < 0) {
//            throw new IllegalArgumentException("Money cannot be negative");
//        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) {
        if (!hasEnoughMoney(product)) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
        this.money -= product.getCost();
        this.products.add(product);
    }

    private boolean hasEnoughMoney(Product product) {
        return this.money >= product.getCost();
    }
}
