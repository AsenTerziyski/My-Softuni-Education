package aquarium.core;

import aquarium.common.ConstantMessages;
import aquarium.common.ExceptionMessages;
import aquarium.entities.aquariums.Aquarium;
import aquarium.entities.aquariums.FreshwaterAquarium;
import aquarium.entities.aquariums.SaltwaterAquarium;
import aquarium.entities.decorations.Decoration;
import aquarium.entities.decorations.Ornament;
import aquarium.entities.decorations.Plant;
import aquarium.entities.fish.Fish;
import aquarium.entities.fish.FreshwaterFish;
import aquarium.repositories.DecorationRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ControllerImpl implements Controller {
    private DecorationRepository decorations;
    private Map<String, Aquarium> aquariums;

    public ControllerImpl() {
        this.aquariums = new LinkedHashMap<>();
        this.decorations = new DecorationRepository();
    }

    @Override
    public String addAquarium(String aquariumType, String aquariumName) {
        switch (aquariumType) {
            case "FreshwaterAquarium":
                Aquarium freshWaterAquarium = new FreshwaterAquarium(aquariumName);
                aquariums.put(aquariumName, freshWaterAquarium);
                break;
            case "SaltwaterAquarium":
                Aquarium saltWaterAquarium = new SaltwaterAquarium(aquariumName);
                aquariums.put(aquariumName, saltWaterAquarium);
                break;
            default:
                throw new NullPointerException(ExceptionMessages.INVALID_AQUARIUM_TYPE);
        }
        return String.format("Successfully added %s.", aquariumType);
    }

    @Override
    public String addDecoration(String type) {
        switch (type) {
            case "Ornament":
                Decoration ornament = new Ornament();
                decorations.add(ornament);
                break;
            case "Plant":
                Decoration plant = new Plant();
                decorations.add(plant);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_DECORATION_TYPE);
        }
        return String.format("Successfully added %s.", type);
    }

    @Override
    public String insertDecoration(String aquariumName, String decorationType) {
        if (this.aquariums.containsKey(aquariumName)) {
            Decoration decoration = this.decorations.findByType(decorationType);
            if (decoration == null) {
                throw new IllegalArgumentException(String.format(ExceptionMessages.NO_DECORATION_FOUND, decorationType));
            }
            Aquarium aquarium = this.aquariums.get(aquariumName);
            aquarium.addDecoration(decoration);
            this.decorations.remove(decoration);
        }
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_DECORATION_IN_AQUARIUM, decorationType, aquariumName);
    }

    @Override
    public String addFish(String aquariumName, String fishType, String fishName, String fishSpecies, double price) {
        if (!fishType.equals("FreshwaterFish") && !fishType.equals("SaltwaterFish")) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_FISH_TYPE);
        }
        Aquarium aquarium = this.aquariums.get(aquariumName);
        if (aquariumName.equals("FreshwaterAquarium") && fishType.equals("FreshwaterFish")) {
            Fish fish = new FreshwaterFish(fishName, fishSpecies, price);
            this.aquariums.get(aquariumName).addFish(fish);
        } else if (aquariumName.equals("SaltwaterAquarium") && fishType.equals("SaltwaterFish")) {
            Fish fish = new FreshwaterFish(fishName, fishSpecies, price);
            this.aquariums.get(aquariumName).addFish(fish);
        } else {
            return "Water not suitable.";
        }

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_FISH_IN_AQUARIUM, fishType, aquariumName);
    }

    @Override
    public String feedFish(String aquariumName) {
        int size = this.aquariums.get(aquariumName).getFish().size();
        return String.format(ConstantMessages.FISH_FED, size);
    }

    @Override
    public String calculateValue(String aquariumName) {
        Aquarium aquarium = aquariums.get(aquariumName);
        double sumFish = aquarium.getFish().stream().mapToDouble(Fish::getPrice).sum();
        double sumDecorations = aquarium.getDecorations().stream().mapToDouble(d -> d.getPrice()).sum();
        return String.format(ConstantMessages.VALUE_AQUARIUM, aquariumName, sumFish + sumDecorations);
    }

    @Override
    public String report() {
        StringBuilder sb = new StringBuilder();
        for (Aquarium value : aquariums.values()) {
            String info = value.getInfo();
            sb.append(info).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
