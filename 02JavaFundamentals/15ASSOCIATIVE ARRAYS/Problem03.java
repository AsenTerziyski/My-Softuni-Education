import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String wordsToLowerCase = words[i].toLowerCase();
            if (counts.containsKey(wordsToLowerCase)) {
                // ако имам думата, увеличвам стойността с 1:
                counts.put(wordsToLowerCase, counts.get(wordsToLowerCase) + 1);
            } else {
                //правя ключа и давам 1 ако нямам думата:
                counts.put(wordsToLowerCase, 1);
            }
        }

        ArrayList<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            if (i == odds.size() - 1) {
                System.out.print(odds.get(i));
            } else {
                System.out.print(odds.get(i) + ", ");
            }

        }
    }
}
