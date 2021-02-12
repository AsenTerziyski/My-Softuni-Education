package G05GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            box.addValue(input);
        }

        String elementToCompare = scanner.nextLine();
        System.out.println(box.countGreaterElements(elementToCompare));
    }
}
