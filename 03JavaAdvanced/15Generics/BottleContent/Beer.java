package BottleContent;

public class Beer {
    private String brand;
    private static int counter = 0;

    public Beer(String brand) {
        this.brand = brand;
    }


    public static int getCounter() {
        return counter+=1;
    }

    @Override
    public String toString() {
        return "Bottle No" + getCounter() + " is filled with " + this.brand;
    }
}
