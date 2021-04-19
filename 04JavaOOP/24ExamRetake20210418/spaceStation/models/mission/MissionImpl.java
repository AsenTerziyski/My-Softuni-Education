package spaceStation.models.mission;

import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.planets.Planet;

import java.util.Collection;

public class MissionImpl implements Mission {

    @Override
    public void explore(Planet planet, Collection<Astronaut> astronauts) {
        Collection<String> items = planet.getItems();
        for (Astronaut astronaut : astronauts) {
            if (astronaut.getOxygen() > 0) {
                    for (String item : items) {
                        while (!items.isEmpty()) {
                            astronaut.getBag().getItems().add(item);
                            astronaut.breath();
                            if (astronaut.getOxygen() == 0) {
                                astronaut.getBag().getItems().clear();
                                break;
                            }
                            items.remove(item);
                        }

                    }


            }
        }
    }
}
