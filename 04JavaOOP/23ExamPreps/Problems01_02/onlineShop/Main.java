package onlineShop;

import onlineShop.core.EngineImpl;
import onlineShop.core.interfaces.Engine;
import onlineShop.models.products.components.Component;
import onlineShop.models.products.components.PowerSupply;
import onlineShop.models.products.components.SolidStateDrive;
import onlineShop.models.products.computers.Computer;
import onlineShop.models.products.computers.Laptop;
import onlineShop.models.products.peripherals.BasePeripheral;
import onlineShop.models.products.peripherals.Keyboard;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
