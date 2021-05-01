package demo01Varargs;

import java.util.Scanner;

public class demo01Varargs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            printStrings(input);
        }
    }

    private static void printStrings(String... input) {
        for (String s : input) {
            System.out.println(s);
        }
    }
}

