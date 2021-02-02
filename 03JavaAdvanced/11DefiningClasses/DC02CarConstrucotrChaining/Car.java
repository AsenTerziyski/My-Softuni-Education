package DC02CarConstrucotrChaining;

public class Car {

    private String brand;
    private String model;
    private int horsePower;

    public Car(){
        // с този празен конструктор мога да инициализам инстанция без да подавам
        // параметри!!!
    }

    public Car(String brand) {

        // с този конструктор сетвам само по полето бранд, другите
        // ако не ги сетна ще вземат стойности съответно ънноун и - 1
        this(brand, "unknown", -1);
//        this.brand = brand;
//        this.model = "unknown";
//        this.horsePower = -1;
    }
    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
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

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(),
                this.getModel(),
                this.getHorsePower());
    }

}
