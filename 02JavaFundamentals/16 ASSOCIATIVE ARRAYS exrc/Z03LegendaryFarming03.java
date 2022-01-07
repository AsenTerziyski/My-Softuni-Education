import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Z03LegendaryFarming03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> keyMaterialsContains = new ArrayList<>();
        keyMaterialsContains.add("Shards".toLowerCase());
        keyMaterialsContains.add("Fragments".toLowerCase());
        keyMaterialsContains.add("Motes".toLowerCase());

        Map<String, Integer> keyMaterials = new HashMap<>();
        Map<String, Integer> junkMaterials = new HashMap<>();


        boolean isObtained = false;

        while (!isObtained) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int i = 0; i < input.length; i = i + 2) {
                int quantity = Integer.parseInt(input[i]);
                String currentMaterial = input[i + 1].toLowerCase();
                if (keyMaterialsContains.contains(currentMaterial)) {
                    keyMaterials.putIfAbsent(currentMaterial, 0);
                    int sumQuantity = keyMaterials.get(currentMaterial) + quantity;
                    keyMaterials.put(currentMaterial,sumQuantity);
                    if (keyMaterials.get(currentMaterial) >= 250) {
                        keyMaterials.put(currentMaterial, keyMaterials.get(currentMaterial) - 250);
                        switch (currentMaterial.toLowerCase()) {
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
                    junkMaterials.putIfAbsent(currentMaterial,0);
                    int sumJunk = junkMaterials.get(currentMaterial) + quantity;
                    junkMaterials.put(currentMaterial,sumJunk);
                }
            }
        }

        keyMaterials.entrySet().stream().sorted((first, second) -> {
            int result = second.getValue().compareTo(first.getValue());
            if (result == 0) {
                result = first.getKey().compareTo(second.getKey());
            }
            return result;

        })
                .forEach(entry -> System.out.println(String.format("%s: %d",entry.getKey(), entry.getValue())));

        junkMaterials.entrySet().stream().sorted((junk1, junk2) -> junk1.getKey().compareTo(junk2.getKey()))
                .forEach(j-> System.out.println(String.format("%s: %d", j.getKey(), j.getValue())));
    }
}
