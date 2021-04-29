package BottleContent;

public class Wine extends Liquid {
    private static int beerBottleCount = counter;

    public Wine(String brand) {
        super(brand);
    }

    public static int getWineBottleCount() {
        return beerBottleCount+=1;
    }

    @Override
    public String toString() {
        return "Bottle №" + getWineBottleCount() + " is filled with: "+this.getBrand();
    }
}
