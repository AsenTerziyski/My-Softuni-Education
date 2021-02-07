package WorkShopDemo07ForEachConsumer;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartArray smartArray = new SmartArray();
        smartArray.add(1);

        for (int i = 1; i < 100; i++) {
            smartArray.add(0, i+1);
        }

        System.out.println();
        smartArray.add(0, 2000);
        System.out.println();
        System.out.println(smartArray.get(5));
        smartArray.forEach(System.out::println);

    }
}
