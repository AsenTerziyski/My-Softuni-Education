package aquarium.entities.aquariums;

import aquarium.common.ConstantMessages;
import aquarium.common.ExceptionMessages;
import aquarium.entities.decorations.Decoration;
import aquarium.entities.fish.Fish;

import java.util.Collection;

public abstract class BaseAquarium implements Aquarium {
    private String name;
    private int capacity;
    private Collection<Decoration> decorations;
    private Collection<Fish> fish;

    protected BaseAquarium(String name, int capacity) {
        this.setName(name);
        this.setCapacity(capacity);
    }

    public int getCapacity() {
        return this.capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.AQUARIUM_NAME_NULL_OR_EMPTY);
        }
    }


    @Override
    public int calculateComfort() {
        int sum = 0;
        for (Decoration decoration : decorations) {
            int comfort = decoration.getComfort();
            sum += comfort;
        }
        return sum;
    }

    @Override
    public void addFish(Fish fish) {
        if (this.fish.size() > this.capacity) {
            throw new IllegalArgumentException(ConstantMessages.NOT_ENOUGH_CAPACITY);
        } else {
            this.fish.add(fish);
        }
    }

    @Override
    public void removeFish(Fish fish) {
        if (!this.fish.isEmpty() && this.fish.contains(fish)) {
            this.fish.remove(fish);
        }
    }

    @Override
    public void addDecoration(Decoration decoration) {
        this.decorations.add(decoration);
    }

    @Override
    public void feed() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getInfo() {
        StringBuilder out = new StringBuilder();
        String aquariumName = this.name;
        String aquariumType = this.getClass().getSimpleName();
        out.append(String.format("%s (%s):", aquariumName, aquariumType)).append(System.lineSeparator());
        String fishNames = "";

        if (this.fish.isEmpty()) {
            out.append("Fish: none");
        } else {
            for (Fish f : this.fish) {
                String name = f.getName();
                fishNames = fishNames + name + " ";
            }
        }
        out.append(fishNames).append(System.lineSeparator());

        int decorationCount = this.decorations.size();
        out.append(String.format("Decorations: %d", decorationCount)).append(System.lineSeparator());

        int comfort = calculateComfort();
        out.append(String.format("Comfort: %d", comfort));

        return out.toString().trim();
    }

    @Override
    public Collection<Fish> getFish() {
        return this.fish;
    }

    @Override
    public Collection<Decoration> getDecorations() {
        return this.decorations;
    }
}
