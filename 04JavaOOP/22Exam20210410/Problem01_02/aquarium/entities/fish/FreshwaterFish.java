package aquarium.entities.fish;

public class FreshwaterFish extends BaseFish {
    private static final int INITIAL_SIZE = 3;

    public FreshwaterFish(String name, String species, double price) {
        super(name, species, price);
        this.size = INITIAL_SIZE;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void eat() {
        this.size += 3;
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
