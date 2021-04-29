package BottleContent;

public class Wine {
    private String brand;
    private static int count = 0;

    public Wine(String brand) {
        this.brand = brand;
    }

    public static int getCount() {
        return count+=1;
    }

    @Override
    public String toString() {
        return "Bottle No" + getCount() + " is filled with " + this.brand;
    }


}
