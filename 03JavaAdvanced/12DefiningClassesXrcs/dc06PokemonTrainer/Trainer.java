package dc06PokemonTrainer;

import dc06PokemonTrainer.Pokemon;

import java.util.ArrayList;

public class Trainer {
    //name, number of badges and a collection of pokemon
    private String name;
    private int budges;
    private ArrayList<Pokemon> pokemonCollection;

    public Trainer(String name, int budges, ArrayList<Pokemon> pokemonCollection) {
        this.name = name;
        this.budges = budges;
        this.pokemonCollection = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBudges(int budges) {
        this.budges = budges;
    }

    public void setPokemonCollection(ArrayList<Pokemon> pokemonCollection) {
        this.pokemonCollection = pokemonCollection;
    }

    public String getName() {
        return name;
    }

    public int getBudges() {
        return budges;
    }

    public ArrayList<Pokemon> getPokemonCollection() {
        return pokemonCollection;
    }

    @Override
    public String toString() {
        return this.name + " " + this.budges + " " + this.pokemonCollection.size();
    }
}
