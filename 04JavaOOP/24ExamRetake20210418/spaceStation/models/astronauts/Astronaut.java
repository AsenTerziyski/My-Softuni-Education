package spaceStation.models.astronauts;

import spaceStation.models.bags.Backpack;

public interface Astronaut {
    String getName();

    double getOxygen();

    boolean canBreath();

    Backpack getBag();

    void breath();
}
