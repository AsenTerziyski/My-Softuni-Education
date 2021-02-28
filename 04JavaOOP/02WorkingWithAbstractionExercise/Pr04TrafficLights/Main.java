package Pr04TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initialTrafficLightState = scanner.nextLine().split("\\s+");
        int numbersOfUpdates = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();
        for (String s : initialTrafficLightState) {
            TrafficLight trafficLight = new TrafficLight(TrafficLightState.valueOf(s));
            trafficLights.add(trafficLight);

        }

        for (int i = 0; i < 4; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight + " ");
            }
            System.out.println();
        }
    }
}
