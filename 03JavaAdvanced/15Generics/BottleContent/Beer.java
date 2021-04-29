package BottleContent;

public class Beer extends Liquid {
    private static int beerBottleCount = counter;

    public Beer(String brand) {
        super(brand);
    }

    public static int getBeerBottleCount() {
        return beerBottleCount+=1;
    }

    @Override
    public String toString() {
        return "Bottle №" + getBeerBottleCount() + " is filled with: "+this.getBrand();
    }
}
