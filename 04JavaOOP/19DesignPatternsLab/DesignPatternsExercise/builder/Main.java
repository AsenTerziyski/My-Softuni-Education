package builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car()
                .withColor("Green")
                .withGasBottle(false)
                .withLightColor("Red").withTyres(100);

        Car car1 = new Car()
                .withColor("Yellow")
                .withLightColor("Blue").withTyres(4);

        System.out.println(car.toString());
        System.out.println(car1.toString());

    }
}
