package onlineShop.models.products.components;

import onlineShop.models.products.BaseProduct;

public class Motherboard extends BaseComponent {
    public Motherboard(int id, String manufacturer, String model, double price, double overallPerformance, int generation) {
        super(id, manufacturer, model, price, overallPerformance, generation);
    }
}
