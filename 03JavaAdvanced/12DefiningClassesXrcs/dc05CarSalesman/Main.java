package dc05CarSalesman;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Engine> engineMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] engineTokens = scanner.nextLine().split("\\s+");
            String model = engineTokens[0];
            int power = Integer.parseInt(engineTokens[1]);
            Engine engineObj = null;
            if (engineTokens.length == 4) {
                int displacement = Integer.parseInt(engineTokens[2]);
                String efficiency = engineTokens[3];
                engineObj = new Engine(model, power, displacement, efficiency);

            } else if (engineTokens.length == 3) {

                if (engineTokens[2].matches("^\\d+$")) {
                    int displacement = Integer.parseInt(engineTokens[2]);
                    engineObj = new Engine(model, power, displacement);
                } else {
                    String efficiency = engineTokens[2];
                    engineObj = new Engine(model, power, efficiency);
                }
            } else if (engineTokens.length == 2) {
                engineObj = new Engine(model, power);
            }
            //engineList.add(engineObj);
            engineMap.putIfAbsent(model, engineObj);
        }

        List<Car> carsList = new LinkedList<>();
        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] carTokens = scanner.nextLine().split("\\s+");
            String carModel = carTokens[0];
            Engine engine = engineMap.get(carTokens[1]);
            Car currentCar = null;
            if (carTokens.length == 4) {
                int weight = Integer.parseInt(carTokens[2]);
                String color = carTokens[3];
                currentCar = new Car(carModel, engine, weight, color);
            } else if (carTokens.length == 3) {
                if (carTokens[2].matches("^\\d+$")) {
                    int weight = Integer.parseInt(carTokens[2]);
                    currentCar = new Car(carModel, engine, weight);
                } else {
                    String color = carTokens[2];
                    currentCar = new Car(carModel, engine, color);
                }
            } else if (carTokens.length == 2) {
                currentCar = new Car(carModel, engine);
            }

            carsList.add(currentCar);
        }

        for (Car car : carsList) {
            System.out.println(car);
        }

//        Map<String, Car> carsMap = new LinkedHashMap<>();
//        int m = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < m; i++) {
//            String[] carTokens = scanner.nextLine().split("\\s+");
//
//            String carModel = carTokens[0];
//            String carEngine = carTokens[1];
//            //Car currentCar = new Car();
//            if (carTokens.length == 4) {
//                int carWeight = Integer.parseInt(carTokens[2]);
//                String carColor = carTokens[3];
//                Engine currentEngine = new Engine();
////                for (int j = 0; j < engineList.size(); j++) {
////                    if (engineList.get(j).getModel().equalsIgnoreCase(carEngine)) {
////                        currentEngine = engineList.get(j);
////                        break;
////                    }
////                }
//                if (engineMap.containsKey(carEngine)) {
//                    currentEngine = engineMap.get(carEngine);
//                }
//                Car currentCar = new Car(carModel, currentEngine, carWeight, carColor);
//                carsMap.put(carModel, currentCar);
//            } else if (carTokens.length == 3) {
//                if (carTokens[2].matches("^\\d+$")) {
//                    int carWeight = Integer.parseInt(carTokens[2]);
//                    Engine currentEngine = new Engine();
////                    for (int j = 0; j < engineList.size(); j++) {
////                        if (engineList.get(j).getModel().equalsIgnoreCase(carEngine)) {
////                            currentEngine = engineList.get(j);
////                            break;
////                        }
////                    }
//                    if (engineMap.containsKey(carEngine)) {
//                        currentEngine = engineMap.get(carEngine);
//                    }
//                    Car currentCar = new Car(carModel, currentEngine, carWeight);
//                    carsMap.put(carModel, currentCar);
//                } else {
//                    String carColor = carTokens[2];
//                    Engine currentEngine = new Engine();
////                    for (int j = 0; j < engineList.size(); j++) {
////                        if (engineList.get(j).getModel().equalsIgnoreCase(carEngine)) {
////                            currentEngine = engineList.get(j);
////                            break;
////                        }
////                    }
//                    if (engineMap.containsKey(carEngine)) {
//                        currentEngine = engineMap.get(carEngine);
//                    }
//                    Car currentCar = new Car(carModel, currentEngine, carColor);
//                    carsMap.put(carModel, currentCar);
//                }
//            } else if (carTokens.length == 2) {
//                Engine currentEngine = new Engine();
////                for (int j = 0; j < engineList.size(); j++) {
////                    if (engineList.get(j).getModel().equalsIgnoreCase(carEngine)) {
////                        currentEngine = engineList.get(j);
////                        break;
////                    }
////                }
//                if (engineMap.containsKey(carEngine)) {
//                    currentEngine = engineMap.get(carEngine);
//                }
//                Car currentCar = new Car(carModel, currentEngine);
//                carsMap.put(carModel, currentCar);
//            }
//        }
//
//        for (Car car : carsMap.values()) {
//            System.out.println(car);
//        }

    }
}
