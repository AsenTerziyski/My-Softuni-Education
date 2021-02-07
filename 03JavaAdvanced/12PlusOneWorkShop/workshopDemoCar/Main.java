package workshopDemoCar;

import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Car lada = new Car("Niva", "Lada");
        lada.addTyre(new Tyre(10, "z"));
        lada.addTyre(new Tyre(11, "z10"));
        lada.addTyre(new Tyre(75, "z11"));
        lada.addTyre(new Tyre(150, "z150"));

        Stack<Car> carsStack = new Stack<>();
        carsStack.push(lada);

        Car ford = new Car("Ford", "Fiesta");
        ford.addTyre(new Tyre(10, "s"));
        ford.addTyre(new Tyre(25, "d"));
        ford.addTyre(new Tyre(55, "d"));
        ford.addTyre(new Tyre(600, "d"));

        carsStack.push(ford);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        carsStack.pop().getTyres().stream().forEach(t-> System.out.println(t.getProducer()));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        lada
                .getTyres()
                .stream()
                .filter(t -> t.getSize() >= 11)
                .sorted((f, s) -> Integer.compare(f.getSize(), s.getSize()))
                .forEach(t -> System.out.println(t.getProducer()));
        // write your code here
}
}
