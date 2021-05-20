import java.util.ArrayList;
import java.util.Scanner;

public class LU07ArraysAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        ArrayList<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] temp = input[i].split("\\s+");
            for (String s : temp) {
                if (!s.equals("")) {
                    result.add(s);
                }
            }
        }

        for (String s : result) {
            System.out.print(s + " ");
        }

    }
}
