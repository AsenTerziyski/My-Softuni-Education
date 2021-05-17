package factoryDesignPattern;

public abstract class Pizza implements IPizza {
    private int diameter;

    public Pizza(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing..." + this.getClass().getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking..." + this.getClass().getSimpleName());

    }

    @Override
    public void box() {
        System.out.println(this.getClass().getSimpleName() + " is ready!");
        System.out.println();

    }
}
