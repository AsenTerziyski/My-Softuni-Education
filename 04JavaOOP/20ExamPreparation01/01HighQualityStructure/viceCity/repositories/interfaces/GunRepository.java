package viceCity.repositories.interfaces;

import viceCity.models.guns.Gun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GunRepository implements Repository<Gun> {
    private List<Gun> models;

    public GunRepository() {
        this.models = new ArrayList<>();
    }

    @Override
    public Collection<Gun> getModels() {
        Collection<Gun> guns = Collections.unmodifiableCollection(models);
        return guns;
    }


    @Override
    public void add(Gun model) {

    }

    @Override
    public boolean remove(Gun model) {
        return false;
    }

    @Override
    public Gun find(String name) {
        return null;
    }
}
