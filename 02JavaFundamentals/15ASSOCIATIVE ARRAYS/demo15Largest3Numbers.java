import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo15Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(s -> Integer.parseInt(s))
                .sorted((first, second) -> second.compareTo(first))
                .limit(5).filter(n-> n>100)
                .collect(Collectors.toList());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
