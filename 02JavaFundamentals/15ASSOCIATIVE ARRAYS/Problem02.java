import java.util.*;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synomym = scanner.nextLine();
            List<String> currentSynonym = wordSynonyms.get(word);
            if (currentSynonym == null) {
                currentSynonym = new ArrayList<>();
                wordSynonyms.put(word, currentSynonym);
            }
            currentSynonym.add(synomym);
        }
        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }

    }
}
