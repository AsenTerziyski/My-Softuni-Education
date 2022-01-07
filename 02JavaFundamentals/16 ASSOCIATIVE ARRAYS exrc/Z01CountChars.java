import java.util.*;

public class Z01CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> letterOccurences = new LinkedHashMap<>();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar != ' ') {
                //tryabva da e golyam Integer shtoto samo toi mozhe da darzhi stoinost null!
                Integer temp = letterOccurences.get(currentChar);
                letterOccurences.putIfAbsent(currentChar, temp);
                if (temp == null) {
                    temp = 0;
                }
                temp = temp + 1;
                letterOccurences.put(currentChar, temp);
            }
        }



//        letterOccurences.entrySet().stream().sorted((first, second)-> {
//            first.getKey().compareTo(second.getKey());
//            int result = 0;
//            if (first.getKey() > second.getKey()) {
//                result = -1;
//            }
//            return result;
//        }).limit(10).forEach(s-> System.out.println(String.format("letter %s === >>> %d occurences", s.getKey(), s.getValue())));
        printMapOfCharactersOccurences(letterOccurences);
    }

    private static void printMapOfCharactersOccurences(Map<Character, Integer> letterOccurences) {
        for (Map.Entry<Character, Integer> entry : letterOccurences.entrySet()) {
            System.out.println(String.format("%c -> %d", entry.getKey(), entry.getValue()));
        }
    }
}
