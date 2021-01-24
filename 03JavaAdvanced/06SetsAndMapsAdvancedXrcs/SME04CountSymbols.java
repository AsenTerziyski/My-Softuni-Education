import java.util.Scanner;
import java.util.TreeMap;

public class SME04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        TreeMap<Character, Integer> charMap = new TreeMap<>();

        for (int i = 0; i < inputString.length(); i++) {

            char currentChar = inputString.charAt(i);
            charMap.putIfAbsent(currentChar, 0);
            charMap.put(currentChar, charMap.get(currentChar) + 1);

        }

        charMap
                .entrySet()
                .forEach(ch -> {

                    char currentCharToPrint = ch.getKey();
                    int currentOccurrence = ch.getValue();
                    System.out.println(String.format("%c: %d time/s", currentCharToPrint, currentOccurrence));

                });
    }
}
