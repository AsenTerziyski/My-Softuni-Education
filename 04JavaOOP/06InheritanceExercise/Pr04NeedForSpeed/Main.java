package Pr04NeedForSpeed;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println(Vehicle.DEFAULT_FUEL_CONSUMPTION); => "C:\Program Files\Java\jdk-12.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.2\lib\idea_rt.jar=63773:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Workstation9\Desktop\JavaCoffee\SoftUni\javaOOP202102\08 EXERCISE INHERITANCE\EnHe\out\production\EnHe" Pr04NeedForSpeed.Main
        //1.25
//        Vehicle vehicle = new Vehicle(1, 1);
//        System.out.println(vehicle.getFuelConsumption());
//        Car car = new Car(1, 1);
//        System.out.println(car.getFuelConsumption());
//        FamilyCar familyCar = new FamilyCar(1, 1);
//        System.out.println(familyCar.getFuelConsumption());
//        SportCar sportCar = new SportCar(1,1);
//        System.out.println(sportCar.getFuelConsumption());
//        RaceMotorcycle raceMotorcycle = new RaceMotorcycle(1,1);
//        System.out.println(raceMotorcycle.getFuelConsumption());
        Car car = new Car(30, 100);
        car.drive(10);
        System.out.println(car.getFuel());
    }
}
