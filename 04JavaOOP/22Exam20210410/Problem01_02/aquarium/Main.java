package aquarium;


import aquarium.core.Engine;
import aquarium.core.EngineImpl;
import aquarium.entities.aquariums.Aquarium;
import aquarium.entities.aquariums.BaseAquarium;
import aquarium.entities.aquariums.FreshwaterAquarium;
import aquarium.entities.aquariums.SaltwaterAquarium;

public class Main {
    public static void main(String[] args) {
//        Decoration dec = new Ornament();
//        System.out.println(dec.getComfort());
//        System.out.println(dec.getPrice());
//        Fish fre = new FreshwaterFish("s", "v", 2);
//        System.out.println(fre.getSize());
//        fre.eat();
//        System.out.println(fre.getSize());
//        System.out.println(fre.getName());
//        System.out.println(fre.getPrice());

//        BaseAquarium aquarium = new FreshwaterAquarium("f");
//        System.out.println(aquarium.getCapacity());
//
//        BaseAquarium aquarium1 = new SaltwaterAquarium("s");
//        System.out.println(aquarium1.getCapacity());

        Engine engine = new EngineImpl();
        engine.run();

    }
}