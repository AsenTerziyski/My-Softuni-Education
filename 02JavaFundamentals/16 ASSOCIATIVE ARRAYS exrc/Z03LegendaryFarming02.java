import java.util.*;

public class Z03LegendaryFarming02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new HashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junkMaterials = new TreeMap<>();

        boolean isObtained = false;
        while (!isObtained) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int i = 0; i < tokens.length; i = i + 2) {
                String material = tokens[i + 1].toLowerCase();
                int quantity = Integer.parseInt(tokens[i]);
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    //keyMaterials.putIfAbsent(material, 0);
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        switch (material) {
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
                        isObtained = true;
                        break;
                    }
                } else {
                    fillMap(junkMaterials, material, quantity);
                }
            }
        }

        //принтиране и сортиране:
        keyMaterials
                .entrySet()
                .stream()
                .sorted((first, second) -> {
                    int result = second.getValue().compareTo(first.getValue()); {
                        if (result == 0) {
                            result = first.getKey().compareTo(second.getKey());
                        }
                        return result;
                    }
                })
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        junkMaterials
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }

    private static void fillMap(Map<String, Integer> materials, String material, int quantity) {
        materials.putIfAbsent(material, 0);
        int currentJunkQ = materials.get(material);
        materials.put(material, currentJunkQ + quantity);
    }
}
