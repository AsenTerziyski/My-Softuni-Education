import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo01SwapElementsOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);

        int index1 = Integer.parseInt(scanner.nextLine());
        int index2 = Integer.parseInt(scanner.nextLine());

        if (index1 >= 0 && index1 < elements.size()) {
            if (index2 >= 0 && index2 < elements.size()) {
                int firstElement = elements.get(index1);
                int temp = firstElement;
                int secondElement = elements.get(index2);
                elements.set(index1, secondElement);
                elements.set(index2, temp);
            }
        }

        elements
                .stream()
                .forEach(System.out::println);

    }
}
