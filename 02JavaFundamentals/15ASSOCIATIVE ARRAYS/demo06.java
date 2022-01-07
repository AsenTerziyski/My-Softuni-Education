import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;

public class demo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> fruits = new HashMap<>();
        int numberOfFruitType = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numberOfFruitType; i++) {
            String currentFruit = scanner.nextLine();
            int currentFruitCount = Integer.parseInt(scanner.nextLine());
            if (!fruits.containsKey(currentFruit)) {
                fruits.put(currentFruit, 0);
            }
            fruits.put(currentFruit, fruits.get(currentFruit) + currentFruitCount);
        }

        String fruitToRemove = scanner.nextLine();
        fruits.remove(fruitToRemove);

        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println(String.format("%s=>>%d", entry.getKey(), entry.getValue()));
        }


        fruitToRemove = scanner.nextLine();
        fruits.remove(fruitToRemove);

        fruits.entrySet()
                .stream()
                .sorted((first, second)-> first.getKey().compareTo(second.getKey()))
                .limit(7)
                .filter((a)-> a.getValue()>10)
                .sorted((fr1, fr2)-> fr2.getValue().compareTo(fr1.getValue()))
                .forEach(fr-> System.out.println(String.format("%s ----- > %d", fr.getKey(), fr.getValue())));

    }
    //7
    //banana
    //2
    //yabalki
    //3
    //praskovi
    //100
    //yagodi
    //150
    //domati
    //15
    //cici
    //11
    //zadntsi
    //25
    //putki
    //banana=>>2
    //cici=>>11
    //yagodi=>>150
    //domati=>>15
    //yabalki=>>3
    //zadntsi=>>25
    //praskovi=>>100
    //25
    //cici ----- > 11
    //domati ----- > 15
    //praskovi ----- > 100
}
