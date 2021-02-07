package workshopSmartArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartArray smartArray = new SmartArray();
        smartArray.add(1000);

        for (int i = 0; i < 10; i++) {
            smartArray.add(0, i+1);
        }

        System.out.println();
        smartArray.add(0, 2000);
        smartArray.add(7, 5000);
        System.out.println();
        System.out.println(smartArray.get(5));
        smartArray.add(10000);
        smartArray.forEach(System.out::println);

    }
}
