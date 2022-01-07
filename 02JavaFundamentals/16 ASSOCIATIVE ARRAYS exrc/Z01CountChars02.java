import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Z01CountChars02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> chars = new LinkedHashMap<>();
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char symbol = charArray[i];
            if (symbol != ' ') {
                if (chars.containsKey(symbol)) {
//                    int count = chars.get(symbol);
//                    chars.put(symbol, count + 1);
                    chars.put(symbol, chars.get(symbol) + 1);
                } else {
                    chars.put(symbol, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //printMap(chars);

    }

    private static void printMap(Map<Character, Integer> chars) {
        chars.forEach((k,v) ->
                        System.out.println(k + " -> " + v));
    }
}
