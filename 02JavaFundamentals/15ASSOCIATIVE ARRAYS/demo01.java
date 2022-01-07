import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> infectedByCity = new HashMap<>();
        int firstDay = 15;
        int secondDay = 30;

//        Integer current = infectedByCity.get("Gabrovo");
//        if (current==null) {
//            current = 0;
//        }
        Integer start = 0;
        if (!infectedByCity.containsKey("Gabrovo")) {
            infectedByCity.put("Gabrovo", start);
        }
        infectedByCity.put("Gabrovo", start + firstDay);
        // current = infectedByCity.get("Gabrovo");
        Integer current = infectedByCity.get("Gabrovo");
//        if (current == null) {
//            current = 0;
//        }
        infectedByCity.put("Gabrovo", current + secondDay);
        System.out.println(infectedByCity.get("Gabrovo"));
    }
}
