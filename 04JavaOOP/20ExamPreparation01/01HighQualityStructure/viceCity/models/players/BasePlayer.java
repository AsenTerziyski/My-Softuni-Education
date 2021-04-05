package viceCity.models.players;

import viceCity.models.guns.Gun;
import viceCity.repositories.interfaces.GunRepository;
import viceCity.repositories.interfaces.Repository;

public abstract class BasePlayer implements Player {
    private String name;
    private int lifePoints;
    private Repository<Gun> gunRepository;



    protected BasePlayer(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.gunRepository = new GunRepository();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getLifePoints() {
        return 0;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public Repository<Gun> getGunRepository() {
        return null;
    }

    @Override
    public void takeLifePoints(int points) {

    }
}
