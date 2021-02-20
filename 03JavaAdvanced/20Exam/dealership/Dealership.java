package dealership;

import java.util.ArrayList;

public class Dealership {
    public String name;
    public int capacity;
    private ArrayList<Car> data;


    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (this.data.size() <= capacity) {
            this.data.add(car);
        }
    }

    //Method buy(String manufacturer, String model) –
    // removes the car by given manufacturer and model, if such exists, and returns boolean.
    public boolean buy(String manufacturer, String model) {
        if (this.data.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < this.data.size(); i++) {
                String currentManufacturer = this.data.get(i).getManufacturer();
                String currentModel = this.data.get(i).getModel();
                if (currentManufacturer.equals(manufacturer) && currentModel.equals(model)) {
                    this.data.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    //•	Method getLatestCar() – returns the latest car (by year) or null if have no cars.
    public Car getLatestCar() {
        if (this.data.isEmpty()) {
            return null;
        } else {
            Car firstCar = this.data.get(0);
            int carYear = firstCar.getYear();
            for (int i = 1; i < this.data.size(); i++) {
                Car currentCar = this.data.get(i);
                int currentCarYear = currentCar.getYear();
                if (currentCarYear > carYear) {
                    return currentCar;
                }
            }
            return firstCar;
        }
    }

    //Method getCar(String manufacturer, String model)
    // – returns the car with the given manufacturer
    // and model or null if there is no such car.
    public Car getCar(String manufacturer, String model) {
        if (!this.data.isEmpty()) {
            for (int i = 0; i < this.data.size(); i++) {
                String currentManufacturer = this.data.get(i).getManufacturer();
                String currentModel = this.data.get(i).getModel();
                if (currentManufacturer.equals(manufacturer) && currentModel.equals(model)) {
                    //Car currentCar = this.data.get(i);
                    return this.data.get(i);
                }
            }
        }
        return null;
    }

    //Getter getCount() – returns the number of cars.
    public int getCount() {
        if (this.data.isEmpty()) {
            return 0;
        } else {
            return this.data.size();
        }
    }

    //•	getStatistics() – returns a String in the following format:
    //o	" The cars are in a car dealership {name}:
    //{Car1}
    //{Car2}
    //(…)"
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        String outputString = String.format("The cars are in a car dealership %s:", this.name);
        if (this.data.isEmpty()) {
            return outputString;
        } else {
            sb.append(outputString).append(System.lineSeparator());
            for (int i = 0; i < this.data.size(); i++) {
                sb.append(this.data.get(i)).append(System.lineSeparator());
            }
            outputString = sb.toString().trim();
            return outputString;
        }
    }
}
