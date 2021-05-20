import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L14Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .map(s-> Integer.parseInt(s)).limit(3)
                .collect(Collectors.toList());

        Collections.reverse(numbers);
        Collections.sort(numbers);

        String output = numbers.toString();

        for (int i = 0; i <numbers.size(); i++) {
            System.out.print(numbers.get(i) + " / ");
        }

        System.out.println(output);
    }
}
