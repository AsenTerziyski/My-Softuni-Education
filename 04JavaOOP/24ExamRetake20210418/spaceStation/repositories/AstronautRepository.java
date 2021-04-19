package spaceStation.repositories;

import spaceStation.models.astronauts.Astronaut;

import java.util.ArrayList;
import java.util.Collection;

public class AstronautRepository implements Repository<Astronaut> {
    private ArrayList<Astronaut> astronauts;

    public AstronautRepository() {
        this.astronauts = new ArrayList<>();
    }

    @Override
    public Collection<Astronaut> getModels() {
        return this.astronauts;
    }

    @Override
    public void add(Astronaut model) {
        this.astronauts.add(model);
    }

    @Override
    public boolean remove(Astronaut model) {
        if (this.astronauts.contains(model)) {
            this.astronauts.remove(model);
            return true;
        }
        return false;
    }

    @Override
    public Astronaut findByName(String name) {
        for (Astronaut astronaut : astronauts) {
            if (astronaut.getName().equalsIgnoreCase(name)) {
                return astronaut;
            }
        }
        return null;
    }
}
