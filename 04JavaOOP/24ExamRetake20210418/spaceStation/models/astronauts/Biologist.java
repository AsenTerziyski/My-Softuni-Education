package spaceStation.models.astronauts;

import spaceStation.models.bags.Backpack;

public class Biologist extends BaseAstronaut {
    private double oxygen;

    public Biologist(String name) {
        super(name, 70);
        this.oxygen = super.getOxygen();
    }

    @Override
    public void breath() {
        if (this.oxygen <= 0) {
            this.oxygen = 0;
        }
        this.oxygen -= 5;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getOxygen() {
        return this.oxygen;
    }

    @Override
    public boolean canBreath() {
        return this.oxygen > 0;
    }

    @Override
    public Backpack getBag() {
        return super.getBag();
    }
}
