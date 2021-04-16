package onlineShop.models.products.computers;

import onlineShop.common.constants.ExceptionMessages;
import onlineShop.models.products.BaseProduct;
import onlineShop.models.products.components.Component;
import onlineShop.models.products.peripherals.Peripheral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class BaseComputer extends BaseProduct implements Computer {
    private List<Component> components;
    private List<Peripheral> peripherals;

    protected BaseComputer(int id, String manufacturer, String model, double price, double overallPerformance) {
        super(id, manufacturer, model, price, overallPerformance);
        this.components = new LinkedList<>();
        this.peripherals = new LinkedList<>();
    }

    @Override
    public double getOverallPerformance() {
        if (this.components.isEmpty()) {
            return super.getOverallPerformance();
        }
        double sumComponents = 0;
        for (int i = 0; i < this.components.size(); i++) {
            sumComponents += this.components.get(i).getOverallPerformance();
        }
        return super.getOverallPerformance() + sumComponents / this.components.size();
    }

    @Override
    public double getPrice() {
        double computerPrice = super.getPrice();

        double componentsPrice = 0;
        for (int i = 0; i < this.components.size(); i++) {
            componentsPrice += this.components.get(i).getPrice();
        }

        double peripheralsPrice = 0;
        for (int i = 0; i < this.peripherals.size(); i++) {
            peripheralsPrice += this.peripherals.get(i).getPrice();
        }

        return componentsPrice + componentsPrice + peripheralsPrice;
    }

    @Override
    public void addComponent(Component component) {
        String compType = component.getClass().getSimpleName();
        for (int i = 0; i < this.components.size(); i++) {
            String componentType = this.components.get(i).getClass().getSimpleName();

            if (compType.equals(componentType)) {
                throw new IllegalArgumentException(String.format("Component %s already exists in %s with Id %d.",
                        componentType,
                        this.getClass().getSimpleName(),
                        this.components.get(i).getId()));
            }
        }

        this.components.add(component);
    }

    @Override
    public Component removeComponent(String componentType) {
        Component component = null;
        for (int i = 0; i < components.size(); i++) {
            if (this.components.get(i).getClass().getSimpleName().equals(componentType)) {
                component = this.components.get(i);
                this.components.remove(i);
                return component;
            }

        }
        throw new IllegalArgumentException(String.format(ExceptionMessages.NOT_EXISTING_COMPONENT,
                componentType,
                this.getClass().getSimpleName(),
                this.getId()));
    }

    @Override
    public void addPeripheral(Peripheral peripheral) {
        for (int i = 0; i < this.peripherals.size(); i++) {
            Peripheral peripheral1 = this.peripherals.get(i);
            if (peripheral1.equals(peripheral)) {
                throw new IllegalArgumentException(String.format(ExceptionMessages.EXISTING_PERIPHERAL,
                        peripheral1.getClass().getSimpleName(),
                        this.getClass().getSimpleName(),
                        this.peripherals.get(i).getId()));
            }
        }
        this.peripherals.add(peripheral);
    }

    @Override
    public Peripheral removePeripheral(String peripheralType) {
        Peripheral periph = null;
        if (this.peripherals.isEmpty()) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.NOT_EXISTING_PERIPHERAL, peripheralType, this.getClass().getSimpleName(), this.getId()));
        }
        for (int i = 0; i < this.peripherals.size(); i++) {
            if (!this.peripherals.get(i).getClass().getSimpleName().equals(peripheralType)) {
                throw new IllegalArgumentException(String.format(ExceptionMessages.NOT_EXISTING_PERIPHERAL, peripheralType, this.getClass().getSimpleName(), this.getId()));
            } else {
                periph = this.peripherals.get(i);
                this.peripherals.remove(i);
                i--;
            }
        }
        return periph;
    }


    @Override
    public List<Component> getComponents() {
        //return Collections.unmodifiableList(this.components);
        return this.components;
    }

    @Override
    public List<Peripheral> getPeripherals() {
        return this.peripherals;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(System.lineSeparator());
        sb.append(String.format("Components (%d):", this.components.size()));
        for (int i = 0; i < this.components.size(); i++) {
            sb.append(String.format("%s %d", this.components.get(i).getClass().getSimpleName(), i)).append(System.lineSeparator());
        }
        int peripheralsCount = this.peripherals.size();
        double overallPerformancePeripheralsSum = 0;

        for (int i = 0; i < this.peripherals.size(); i++) {
            overallPerformancePeripheralsSum += this.peripherals.get(i).getOverallPerformance();
        }

        double averageOverallPerformancePeripherals = overallPerformancePeripheralsSum / this.peripherals.size();
        String peripheralsOutput = String.format("Peripherals (%d); Average Overall Performance (%.2f):", this.peripherals.size(), averageOverallPerformancePeripherals);
        sb.append(peripheralsOutput).append(System.lineSeparator());

        for (int i = 0; i < this.peripherals.size(); i++) {
            sb.append(String.format("%s %d", this.peripherals.get(i).getClass().getSimpleName(), i)).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }


    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }


}
