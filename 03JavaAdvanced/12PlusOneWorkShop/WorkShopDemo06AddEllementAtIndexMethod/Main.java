package WorkShopDemo06AddEllementAtIndexMethod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartArray smartArray = new SmartArray();
        smartArray.add(1);
        for (int i = 1; i < 8; i++) {
            smartArray.add(i + 1);
        }

        int element = Integer.parseInt(scanner.nextLine());
        if (smartArray.contains(element)) {
            System.out.println("Contains: " + element);
        } else {
            System.out.println("The collection does not contain element: " + element);
        }

        System.out.println();

        smartArray.add(0,2000);
        System.out.println();
        System.out.println(smartArray.get(5));

    }
}
