package workshopDemoCar;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String carProducer;
    private List<Tyre> tyres;

    public Car(String model, String carProducer) {
        this.model = model;
        this.carProducer = carProducer;
        this.tyres = new ArrayList<>();
    }

    public void addTyre (Tyre tyre) {
        this.tyres.add(tyre);
    }

    public String getModel() {
        return model;
    }

    public String getCarProducer() {
        return carProducer;
    }

    public List<Tyre> getTyres() {
        return tyres;
    }
}
