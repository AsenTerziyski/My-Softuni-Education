import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L13ReverseSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        Collections.sort(numbers);
        Collections.reverse(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size() - 1) {
                System.out.print(numbers.get(i) + " - ");
            } else {
                System.out.println(numbers.get(i));
            }
        }


    }
}
