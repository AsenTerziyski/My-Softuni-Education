import java.util.*;

public class demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // в тази задача трябва да е АррейЛист, а не само Лист. Каква е разликата между двата?
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n; i++) {
            String word = scanner.nextLine();
            String synonym =scanner.nextLine();
            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        words
                .entrySet()
                .stream()
                .forEach(e-> System.out.println(String.format("%s - %s", e.getKey(), String.join(", ", e.getValue()))));
    }
}
