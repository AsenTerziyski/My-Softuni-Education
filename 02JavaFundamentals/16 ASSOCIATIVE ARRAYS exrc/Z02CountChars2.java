import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Z02CountChars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> occ = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            occ.putIfAbsent(currentChar, 0);
            int count = occ.get(currentChar);
            if (occ.containsKey(currentChar)) {
                count = count + 1;
            }
            occ.put(currentChar, count);
        }

//        for (Map.Entry<Character, Integer> entry : occ.entrySet()) {
//            if (entry.getKey() != ' ') {
//                System.out.println(String.format("%c -> %d", entry.getKey(), entry.getValue()));
//            }
//        }

        occ.entrySet()
                .stream()
                .filter(c-> c.getKey() != ' ')
                .forEach(c-> System.out.println(String.format("%c -> %d", c.getKey(), c.getValue())));
    }
}
