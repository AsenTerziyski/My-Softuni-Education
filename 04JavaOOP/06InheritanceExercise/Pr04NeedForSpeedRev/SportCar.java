package demo01NeedForSpeed;


public class SportCar extends Car {

    public SportCar(double fuel, int horsePower, String color) {
        super(fuel, horsePower, color);
    }

    @Override
    public void drive(double kilometers) {
        super.drive(kilometers);
    }

    @Override
    public String toString() {
        return super.toString() + " This car is SPORT CAR!";
    }
}
