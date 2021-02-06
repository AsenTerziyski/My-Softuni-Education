package WorkShopDemo05ContainsMethod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartArray smartArray = new SmartArray();
        for (int i = 0; i < 8; i++) {
            smartArray.add(i + 1);
        }

        int element = Integer.parseInt(scanner.nextLine());
        if (smartArray.contains(element)) {
            System.out.println("Contains: " + element);
        } else {
            System.out.println("The collection does not contain element: " + element);
        }

    }
}
