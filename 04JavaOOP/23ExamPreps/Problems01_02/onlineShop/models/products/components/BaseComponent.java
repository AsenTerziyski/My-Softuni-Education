package onlineShop.models.products.components;

import onlineShop.models.products.BaseProduct;

public abstract class BaseComponent extends BaseProduct implements Component {
    private int generation;

    protected BaseComponent(int id, String manufacturer, String model, double price, double overallPerformance, int generation) {
        super(id, manufacturer, model, price, overallPerformance);
        this.setGeneration(generation);
    }

    private void setGeneration(int generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Generation: %d", this.generation);
    }

    @Override
    public int getGeneration() {
        return this.generation;
    }
}
