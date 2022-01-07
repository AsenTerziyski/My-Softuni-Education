import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> infectedByCity = new HashMap<>();
//        String command = scanner.next();
//        while (!command.equals("end")) {
//            if (command.equals("report")) {
//                String cityName = scanner.next();
//                System.out.println(infectedByCity.get(cityName));
//            } else {
//                int newlyInfected = scanner.nextInt();
//
//                Integer currentInfected = infectedByCity.get(command);
//                if (currentInfected == null) {
//                    currentInfected = 0;
//                }
//
//                infectedByCity.put(command, currentInfected + newlyInfected);
//            }
//
//            command = scanner.next();
//        }

//        for (Map.Entry<String, Integer> entry : infectedByCity.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.equals("report")) {
                String cityName = scanner.nextLine();
                if (infectedByCity.containsKey(cityName) && infectedByCity.get(cityName) >= 0) {
                    System.out.println(String.format("%s -> %d", cityName, infectedByCity.get(cityName)));
                    break;
                    //command = scanner.nextLine();
                } else {
                    System.out.println("Not in list!");
                }
            } else if (!infectedByCity.containsKey(command)) {
                infectedByCity.put(command, 0);
            }
            int currentInfected = Integer.parseInt(scanner.nextLine());
            infectedByCity.put(command, infectedByCity.get(command) + currentInfected);
            command = scanner.nextLine();
        }


//        for (Map.Entry<String, Integer> entry : infectedByCity.entrySet()) {
//            System.out.println(String.format("%s => %d", entry.getKey(), entry.getValue()));
//        }

        infectedByCity.entrySet().stream().sorted((f,s)-> f.getKey().compareTo(s.getKey())).sorted((f,s)-> f.getValue().compareTo(s.getValue())).
                forEach(e-> System.out.println(String.format("City %s ==== >>>> %d infected", e.getKey(), e.getValue())));

    }
}
