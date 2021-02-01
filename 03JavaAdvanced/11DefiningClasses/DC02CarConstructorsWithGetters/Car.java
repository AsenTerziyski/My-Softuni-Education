package DC02CarConstructorsWithGetters;

public class Car {
    public String brand;
    public String model;
    public int horsePower;

//    public Car(String brandParam, String modelParam, int horsePowerParam) {
//        brand = brandParam;
//        model = modelParam;
//        horsePower = horsePowerParam;
//    }
//
//    public Car(String brand) {
//        this.brand = brand;
//        this.model = "unknown";
//        this.horsePower = -1;
//    }
//
//    public Car (String brand, String model, int horsePower) {
//        this(brand);
//        this.model = model;
//        this.horsePower = horsePower;
//    }
    public Car (String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
