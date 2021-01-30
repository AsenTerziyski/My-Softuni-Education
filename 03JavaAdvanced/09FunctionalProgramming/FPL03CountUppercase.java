import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FPL03CountUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startsWithUpperCase = str -> str != null && !str.isEmpty() && Character.isUpperCase(str.charAt(0));

        List<String> upperCaseWords = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startsWithUpperCase)
                .collect(Collectors.toList());

//        List<String> upperCaseWordsSecond = Arrays
//                .stream(scanner.nextLine()
//                        .split("\\s+"))
//                .filter(MyString.wordStartsWithUpperCase)
//                .collect(Collectors.toList());

        System.out.println(upperCaseWords.size());
        upperCaseWords
                .stream()
                .forEach(str -> System.out.println(str));

    }
}
