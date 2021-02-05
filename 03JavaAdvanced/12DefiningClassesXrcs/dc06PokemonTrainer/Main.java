package dc06PokemonTrainer;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();
        while (!"Tournament".equalsIgnoreCase(input)) {

            String[] tokens = input.split("\\s+");

            String trainerName = tokens[0];
            ArrayList<Pokemon> pokemonArrayList = null;
            Trainer currentTrainer = new Trainer(trainerName, 0, pokemonArrayList);
            trainerMap.putIfAbsent(trainerName, currentTrainer);

            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            Pokemon currentPokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (trainerMap.containsKey(trainerName)) {
                trainerMap.get(trainerName).getPokemonCollection().add(currentPokemon);
            }

            input = scanner.nextLine();
        }

        String currentElement = scanner.nextLine();

        while (!currentElement.equalsIgnoreCase("End")) {
            for (Map.Entry<String, Trainer> trainerEntry : trainerMap.entrySet()) {
                Trainer currentTrainer = trainerEntry.getValue();
                ArrayList<Pokemon> currentArray = trainerEntry.getValue().getPokemonCollection();
                for (int i = 0; i <currentArray.size(); i++) {
                    if (currentElement.equals(currentArray.get(i).getElement())) {
                        int budges = currentTrainer.getBudges();
                        budges = budges + 1;
                        currentTrainer.setBudges(budges);
                        break;
                    } else {
                        Pokemon currentPokemon = trainerEntry.getValue().getPokemonCollection().get(i);
                        int health = currentPokemon.getHealth() - 10;
                        if (health <=0) {
                            currentArray.remove(currentPokemon);
                        }
                        currentPokemon.setHealth(health);
                    }
                }
            }

            currentElement = scanner.nextLine();
        }



        trainerMap
                .entrySet()
                .stream()
                .sorted((f,s)-> {
            return Integer.compare(s.getValue().getBudges(), f.getValue().getBudges());
        }).forEach(e-> System.out.println(e.getValue()));

        // write your code here
    }
}
