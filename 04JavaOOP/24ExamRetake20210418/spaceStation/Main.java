package spaceStation;

import spaceStation.core.Controller;
import spaceStation.core.ControllerImpl;
import spaceStation.core.Engine;
import spaceStation.core.EngineImpl;
import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.astronauts.Biologist;
import spaceStation.models.astronauts.Geodesist;
import spaceStation.models.astronauts.Meteorologist;

public class Main {
    public static void main(String[] args) {
        ControllerImpl controller = new ControllerImpl();
        EngineImpl engine = new EngineImpl(controller);
        engine.run();


    }
}
