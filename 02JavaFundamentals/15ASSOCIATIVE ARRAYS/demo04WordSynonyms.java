import java.util.*;

public class demo04WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> wordSynonyms = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            //Варинат 1:
//            List<String> currentSynonyms = wordSynonyms.get(word);
//            if (currentSynonyms == null) {
//                currentSynonyms = new ArrayList<>();
//                wordSynonyms.put(word, currentSynonyms);
//            }
//            currentSynonyms.add(synonym);

            //Варинат 2:
//            if (!wordSynonyms.containsKey(word)) {
//                wordSynonyms.put(word, new LinkedList<>());
//            }

            //Варинат 3:
            wordSynonyms.putIfAbsent(word,new LinkedList<>());
            wordSynonyms.get(word).add(synonym);

        }

//        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
        //стринг джойн работи само за листове? И Масиви?
//            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
//        }

        wordSynonyms
                .entrySet()
                .stream()
                .forEach(entry-> System.out.println(entry.getKey() + " ==== >>> " + String.join(", ", entry.getValue())));

    }
}
