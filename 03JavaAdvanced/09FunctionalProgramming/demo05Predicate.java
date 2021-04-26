import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class demo05Predicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startWithUpperCase = str -> str != null && !str.isEmpty() && Character.isUpperCase(str.charAt(0));
        List<String> upperCaseWords = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .filter(startWithUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseWords.size());
        StringBuilder sb = new StringBuilder();
        for (String s : upperCaseWords) {
            sb.append(s).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
