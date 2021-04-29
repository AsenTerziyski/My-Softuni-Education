package BottleContent;

public abstract class Liquid {
    private String brand;
    protected static int counter = 0;


    public Liquid(String brand) {
        this.brand = brand;
    }

    public static int getCounter() {
        return counter;
    }

    public String getBrand() {
        return brand;
    }
}
