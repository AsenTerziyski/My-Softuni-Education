import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Z03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean isObtained = false;
        while (!isObtained) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            for (int i = 0; i < inputLine.length; i = i + 2) {
                int quantity = Integer.parseInt(inputLine[i]);
                String item = inputLine[i + 1].toLowerCase();
                if (keyMaterials.containsKey(item)) {
                    addToMap(keyMaterials, item, quantity);
                    isObtained = isObtainedM(keyMaterials, item);
                    if (isObtained) {
                        break;
                    }
                } else {
                    addToMap(junk, item, quantity);
                }
            }
        }
        keyMaterials
                .entrySet()
                .stream()
                .sorted((i1, i2) -> {
                    int result = i2.getValue().compareTo(i1.getValue());
                    if (result == 0) {
                        result = i1.getKey().compareTo(i2.getKey());
                    }
                    return result;
                })
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));

        junk
                .entrySet()
                .stream()
                .sorted((i1, i2) -> i1.getKey().compareTo(i2.getKey()))
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));

    }

    private static boolean isObtainedM(Map<String, Integer> map, String item) {
        if (map.get(item) >= 250) {
            int newQauntity = map.get(item) - 250;
            map.put(item, newQauntity);
            switch (item) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;
            }
            return true;
        }
        return false;
    }

    private static void addToMap(Map<String, Integer> map, String item, int quantity) {
        map.putIfAbsent(item, 0);
//        int newQuantity = map.get(item) + quantity;
//        map.put(item, newQuantity);
        map.put(item, map.get(item) + quantity);
    }

}
