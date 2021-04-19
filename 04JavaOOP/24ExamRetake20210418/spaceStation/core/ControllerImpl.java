package spaceStation.core;

import spaceStation.common.ConstantMessages;
import spaceStation.common.ExceptionMessages;
import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.astronauts.Biologist;
import spaceStation.models.astronauts.Geodesist;
import spaceStation.models.astronauts.Meteorologist;
import spaceStation.models.mission.Mission;
import spaceStation.models.mission.MissionImpl;
import spaceStation.models.planets.Planet;
import spaceStation.models.planets.PlanetImpl;
import spaceStation.repositories.AstronautRepository;
import spaceStation.repositories.PlanetRepository;

import java.util.ArrayList;
import java.util.Collection;

public class ControllerImpl implements Controller {
    private Astronaut astronaut;
    private Planet planet;
    private AstronautRepository astronautRepository;
    private AstronautRepository leftAstronauts;
    private PlanetRepository planetRepository;
    private PlanetRepository exploredPlanet;

    public ControllerImpl() {
        this.astronautRepository = new AstronautRepository();
        this.planetRepository = new PlanetRepository();
        this.exploredPlanet = new PlanetRepository();
    }

    @Override
    public String addAstronaut(String type, String astronautName) {
        this.astronaut = null;
        switch (type) {
            case "Biologist":
                astronaut = new Biologist(astronautName);
                this.astronautRepository.add(astronaut);
                break;
            case "Geodesist":
                astronaut = new Geodesist(astronautName);
                this.astronautRepository.add(astronaut);
            case "Meteorologist":
                astronaut = new Meteorologist(astronautName);
                this.astronautRepository.add(astronaut);
                break;
            default:
                return ExceptionMessages.ASTRONAUT_INVALID_TYPE;
        }
        return String.format(ConstantMessages.ASTRONAUT_ADDED, type, astronautName);
    }

    @Override
    public String addPlanet(String planetName, String... items) {
        planet = new PlanetImpl(planetName);
        for (String item : items) {
            planet.getItems().add(item);
        }
        this.planetRepository.add(planet);
        return String.format(ConstantMessages.PLANET_ADDED, planetName);
    }

    @Override
    public String retireAstronaut(String astronautName) {
        Astronaut byName = this.astronautRepository.findByName(astronautName);
        if (byName == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.ASTRONAUT_DOES_NOT_EXIST, astronautName));
        }
        this.astronautRepository.remove(byName);
        return String.format(ConstantMessages.ASTRONAUT_RETIRED, astronautName);
    }

    @Override
    public String explorePlanet(String planetName) {
        Planet planetToExplore = this.planetRepository.findByName(planetName);
        Collection<Astronaut> models = this.astronautRepository.getModels();
        ArrayList<Astronaut> pickedAstronauts = new ArrayList<>();

        int startPicked = 0;
        for (Astronaut model : models) {
            if (model.getOxygen() > 60) {
                pickedAstronauts.add(model);
                startPicked += 1;
            }
        }

        if (pickedAstronauts.size() == 0) {
            throw new IllegalArgumentException(ExceptionMessages.PLANET_ASTRONAUTS_DOES_NOT_EXISTS);
        }
        Mission mission = new MissionImpl();
        mission.explore(planetToExplore, pickedAstronauts);
        int endPicked = pickedAstronauts.size();
        int deadAstr = startPicked - endPicked;
        this.exploredPlanet.add(planetToExplore);
        for (int i = 0; i <pickedAstronauts.size(); i++) {
            this.leftAstronauts.add(pickedAstronauts.get(i));
        }
        return String.format(ConstantMessages.PLANET_EXPLORED, planetName, deadAstr);
    }

    @Override
    public String report() {
        int exploredPlanetsCount = this.exploredPlanet.getModels().size();
        System.out.println(String.format(ConstantMessages.REPORT_PLANET_EXPLORED, exploredPlanetsCount));
        StringBuilder sb = new StringBuilder();
        sb.append("Astronauts info:").append(System.lineSeparator());
        Collection<Astronaut> astronauts = this.leftAstronauts.getModels();
        for (Astronaut a : astronauts) {
            String name = a.getName();
            sb.append(String.format("Name: %s", name)).append(System.lineSeparator());
            double oxygen = a.getOxygen();
            sb.append(String.format("Oxygen: %.0f", oxygen)).append(System.lineSeparator());
            Collection<String> items = a.getBag().getItems();
            String output = "";
            for (String item : items) {
                output = output + item + ", ";
            }
            sb.append(output).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
