import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem02WordSynonyms01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            words.putIfAbsent(word, new ArrayList<>());
            // с тази операция вземаме стойността на съответния ключ, която е лист в случая и
            // към него /листа/ добавяме с командата за листове адд думата,
            // която е синоним:
            words.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }
    }
}
