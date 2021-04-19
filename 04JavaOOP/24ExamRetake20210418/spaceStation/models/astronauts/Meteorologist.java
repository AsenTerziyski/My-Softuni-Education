package spaceStation.models.astronauts;

import spaceStation.models.bags.Backpack;

public class Meteorologist extends BaseAstronaut {
    private double oxygen;

    public Meteorologist(String name) {
        super(name, 90);
        this.oxygen = super.getOxygen();
    }

    @Override
    public void breath() {
        if (this.oxygen <= 0) {
            this.oxygen = 0;
        }
        this.oxygen -= 10;
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
