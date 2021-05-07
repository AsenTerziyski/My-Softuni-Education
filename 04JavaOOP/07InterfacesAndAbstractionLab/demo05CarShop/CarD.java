package demo05CarShop;

import Pr02CarShopExtend.Car;

public class CarD implements DemoCar {

    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public CarD(String model, String color, Integer horsePower, String countryProduced) {
        this.setModel(model);
        this.setColor(color);
        this.setHorsePower(horsePower);
        this.setCountryProduced(countryProduced);
    }

    private void setCountryProduced(String countryProduced) {
        if (CarValidator.countryProducedValidate(countryProduced) && CarValidator.countryProducedValidateCanNotBeSudan(countryProduced)) {
            this.countryProduced = countryProduced;
        }
    }

    private void setHorsePower(Integer horsePower) {
        if (CarValidator.horsePowerValidate(horsePower)) {
            this.horsePower = horsePower;
        }
    }

    private void setColor(String color) {
        CarValidator.colorValidate(color);
        this.color = color;
    }

    private void setModel(String model) {
        CarValidator.modelValidate(model);
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String getCountryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        return this.getClass()
                + "=>" + this.color
                + "=>" + this.countryProduced
                + "=>" + this.horsePower
                + "=>" + this.model;
    }
}
