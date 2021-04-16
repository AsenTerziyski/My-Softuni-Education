package onlineShop.core;

import onlineShop.common.constants.ExceptionMessages;
import onlineShop.common.constants.OutputMessages;
import onlineShop.core.interfaces.Controller;
import onlineShop.models.products.components.*;
import onlineShop.models.products.computers.Computer;
import onlineShop.models.products.computers.DesktopComputer;
import onlineShop.models.products.computers.Laptop;
import onlineShop.models.products.peripherals.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ControllerImpl implements Controller {
    private Map<Integer, Computer> computersMap;
    private Map<Integer, Component> componentsMap;
    private Map<Integer, Peripheral> peripheralsMap;

    public ControllerImpl() {
        this.computersMap = new LinkedHashMap<>();
        this.componentsMap = new LinkedHashMap<>();
        this.peripheralsMap = new LinkedHashMap<>();
    }

    @Override
    public String addComputer(String computerType, int id, String manufacturer, String model, double price) {
        if (this.computersMap.containsKey(id)) {
            throw new IllegalArgumentException(ExceptionMessages.EXISTING_COMPUTER_ID);
        }
        Computer computer = null;
        switch (computerType) {
            case "DesktopComputer":
                computer = new DesktopComputer(id, manufacturer, model, price);
                this.computersMap.put(id, computer);
                break;
            case "Laptop":
                computer = new Laptop(id, manufacturer, model, price);
                this.computersMap.put(id, computer);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_COMPUTER_TYPE);
        }
        return String.format("Computer with id %d added successfully.", id);
    }

    @Override
    public String addComponent(int computerId, int id, String componentType, String manufacturer, String model, double price, double overallPerformance, int generation) {
        if (componentsMap.containsKey(id)) {
            throw new IllegalArgumentException(ExceptionMessages.EXISTING_COMPONENT_ID);
        }
        //Component currentComponent = null;
        switch (componentType) {
            case "Motherboard": {
                Component currentComponent = new Motherboard(id, manufacturer, model, price, overallPerformance, generation);
                addComponentToComputerWithSpecifiedId(computerId, currentComponent);
                this.componentsMap.putIfAbsent(id, currentComponent);
                break;
            }
            case "PowerSupply": {
                Component currentComponent = new PowerSupply(id, manufacturer, model, price, overallPerformance, generation);
                this.componentsMap.putIfAbsent(id, currentComponent);
                addComponentToComputerWithSpecifiedId(id, currentComponent);
                break;
            }
            case "RandomAccessMemory": {
                Component currentComponent = new RandomAccessMemory(id, manufacturer, model, price, overallPerformance, generation);
                this.componentsMap.putIfAbsent(id, currentComponent);
                addComponentToComputerWithSpecifiedId(id, currentComponent);
                break;
            }
            case "SolidStateDrive": {
                Component currentComponent = new SolidStateDrive(id, manufacturer, model, price, overallPerformance, generation);
                this.componentsMap.putIfAbsent(id, currentComponent);
                addComponentToComputerWithSpecifiedId(id, currentComponent);
                break;
            }
            case "VideoCard": {
                Component currentComponent = new VideoCard(id, manufacturer, model, price, overallPerformance, generation);
                this.componentsMap.putIfAbsent(id, currentComponent);
                addComponentToComputerWithSpecifiedId(id, currentComponent);
                break;
            }
            case "CentralProcessingUnit": {
                Component currentComponent = new CentralProcessingUnit(id, manufacturer, model, price, overallPerformance, generation);
                this.componentsMap.putIfAbsent(id, currentComponent);
                addComponentToComputerWithSpecifiedId(id, currentComponent);
                break;
            }
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_COMPONENT_TYPE);
        }
        return String.format(OutputMessages.ADDED_COMPONENT, componentType, id, computerId);
    }

    private void addComponentToComputerWithSpecifiedId(int computerId, Component currentComponent) {
        this.computersMap.get(computerId).addComponent(currentComponent);
    }

    @Override
    public String removeComponent(String componentType, int computerId) {
        Computer computer = this.computersMap.get(computerId);
        computer.removeComponent(componentType);
        int id = -1;
        for (Component value : componentsMap.values()) {
            if (value.getClass().getSimpleName().equalsIgnoreCase(componentType)) {
                id = value.getId();
            }
        }
        Component removedComponent = this.componentsMap.remove(id);
        return String.format(OutputMessages.REMOVED_COMPONENT, componentType, id);
    }

    @Override
    public String addPeripheral(int computerId, int id, String peripheralType, String manufacturer, String model, double price, double overallPerformance, String connectionType) {
        Computer currentPC = this.computersMap.get(computerId);
        Peripheral peripheral = null;
        switch (peripheralType) {
            case "Headset":
                peripheral = new Headset(id, manufacturer, model, price, overallPerformance, connectionType);
                addPeripheralToCollections(id, currentPC, peripheral);
                break;
            case "Keyboard":
                peripheral = new Keyboard(id, manufacturer, model, price, overallPerformance, connectionType);
                addPeripheralToCollections(id, currentPC, peripheral);
                break;
            case "Monitor":
                peripheral = new Monitor(id, manufacturer, model, price, overallPerformance, connectionType);
                addPeripheralToCollections(id, currentPC, peripheral);
                break;
            case "Mouse":
                peripheral = new Mouse(id, manufacturer, model, price, overallPerformance, connectionType);
                addPeripheralToCollections(id, currentPC, peripheral);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_PERIPHERAL_TYPE);
        }
        return String.format(OutputMessages.ADDED_PERIPHERAL, peripheralType, id, computerId);
    }

    private void addPeripheralToCollections(int id, Computer currentPC, Peripheral peripheral) {
        currentPC.getPeripherals().add(peripheral);
        this.peripheralsMap.putIfAbsent(id, peripheral);
    }

    @Override
    public String removePeripheral(String peripheralType, int computerId) {
        int peripheralId = -1;
        for (Peripheral value : peripheralsMap.values()) {
            if (value.getClass().getSimpleName().equalsIgnoreCase(peripheralType)) {
                peripheralId = value.getId();
            }
        }
        peripheralsMap.remove(peripheralId);
        List<Peripheral> peripheralsOfCurrentPC = this.computersMap.get(computerId).getPeripherals();
        for (int i = 0; i < peripheralsOfCurrentPC.size(); i++) {
            if (peripheralsOfCurrentPC.get(i).getClass().getSimpleName().equals(peripheralType)) {
                peripheralsOfCurrentPC.remove(i);
                i--;
            }
        }
        return String.format(OutputMessages.REMOVED_PERIPHERAL, peripheralType, peripheralId);
    }

    @Override
    public String buyComputer(int id) {
        Computer computer = null;
        if (this.computersMap.containsKey(id)) {
            computer = this.computersMap.get(id);
        }
        return computer.toString().trim();
    }

    @Override
    public String BuyBestComputer(double budget) {
        double highest = 0;
        Map.Entry<Integer, Computer> integerComputerEntry = this.computersMap
                .entrySet().stream()
                .sorted((pc1, pc2) -> Double.compare(pc1.getValue().getOverallPerformance(), pc2.getValue().getOverallPerformance()))
                .filter(pc -> pc.getValue().getPrice() <= budget).findFirst().orElse(null);
        if (integerComputerEntry == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.CAN_NOT_BUY_COMPUTER, budget));
        }
        Integer key = integerComputerEntry.getKey();
        Computer removed = this.computersMap.remove(key);
        return removed.toString().trim();
    }

    @Override
    public String getComputerData(int id) {
        return null;
    }
}
