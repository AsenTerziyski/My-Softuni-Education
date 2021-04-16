package onlineShop.models.products.computers;

import onlineShop.models.products.components.Component;

public class Laptop extends BaseComputer {
    public Laptop(int id, String manufacturer, String model, double price) {
        super(id, manufacturer, model, price, 10);
    }

    @Override
    public Component removeComponent(String componentType) {
        return super.removeComponent(componentType);
    }
}
