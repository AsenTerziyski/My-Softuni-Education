package dc04RawData;

import java.util.Arrays;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tier[] tiers;

    public Car(String model, Engine engine, Cargo cargo, Tier[] tiers) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tiers = tiers;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean hasTireWithPressureLessThanOne() {
        for (Tier tier : tiers) {
            if (tier.getPressure() < 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String model = this.model;
        return model;
    }
}

