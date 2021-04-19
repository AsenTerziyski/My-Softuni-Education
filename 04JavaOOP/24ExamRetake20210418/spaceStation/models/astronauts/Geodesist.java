package spaceStation.models.astronauts;

import spaceStation.models.bags.Backpack;

public class Geodesist extends BaseAstronaut {
    //private double oxygen;

    public Geodesist(String name) {
        super(name, 50);
        //this.oxygen = super.getOxygen();
    }

    @Override
    public void breath() {
        super.breath();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getOxygen() {
        return super.getOxygen();
    }

    @Override
    public boolean canBreath() {
        return super.canBreath();
    }


    @Override
    public Backpack getBag() {
        return super.getBag();
    }
}
