import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class page07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> airPlanes = new HashMap<>();
        airPlanes.put("Boeing 737", 130);
        airPlanes.put("Airbus A320", 151);
        airPlanes.put("Airxxx A320", 149);
        airPlanes.put("Airxxl A320", 1152);
        airPlanes.put("Airxll A320", 138);
        airPlanes.put("Airlll A320", 1111111);
        airPlanes.put("Proben samolet", 350);
        airPlanes.remove("Proben samolet");
//
//        if (airPlanes.containsKey("Airbus A320")) {
//            System.out.println(airPlanes.get("Airbus A320") + " key exist");
//        }
//
//        if (airPlanes.containsValue(150)) {
//            System.out.println(airPlanes.containsValue(150));
//        }
//
//        for (Map.Entry<String, Integer> entry : airPlanes.entrySet()) {
//            System.out.printf("%s >>=>> %d%n", entry.getKey(), entry.getValue());
//        }
//
//        // втори начин за принтиране:
//        for (Map.Entry<String, Integer> entry : airPlanes.entrySet()) {
//            System.out.println(String.format("%s >> == ++ -- >> %d",entry.getKey(), entry.getValue()));
//        }
        airPlanes.entrySet()
                .stream()
                .sorted((first, second)-> first.getKey().compareTo(second.getKey()))
                .filter(s->s.getValue()>=151)
                .limit(4).
                sorted((first, second)-> first.getValue().compareTo(second.getValue()))
                .forEach(e-> System.out.println(String.format("%s -////- >>> %d", e.getKey(), e.getValue())));
    }
}
