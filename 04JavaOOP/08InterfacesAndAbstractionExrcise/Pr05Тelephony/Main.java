package Pr05Тelephony;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String[] numbsAsArray = scanner.nextLine().split("\\s+");
        List<String> numbsAsList = parseList(numbsAsArray);

        String[] urlsAsArray = scanner.nextLine().split("\\s+");
        List<String> urlsAsList = parseList(urlsAsArray);

        Smartphone smartphone = new Smartphone(numbsAsList, urlsAsList);
        System.out.println();

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());

    }

    private static List<String> parseList(String[] input) {
        List<String> output = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            output.add(input[i]);
        }
        return output;
    }
}
