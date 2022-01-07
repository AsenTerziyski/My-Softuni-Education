import java.util.Arrays;
import java.util.Scanner;

public class Problem04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("\\s+");
        String[] words = Arrays.stream(inputString)
                .filter(w -> w.length() % 2 == 0)
                .toArray(value -> new String[value]);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
