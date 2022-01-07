package com.company;

import java.util.Scanner;

public class nl01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int rows = 1;
        int cols = 1;
        int current = 1;
        boolean isBiger = false;

        for (rows = 1; rows <= n; rows++) {
            for (cols = 1; cols <= rows; cols++) {
                if (current > n) {
                    isBiger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            if (isBiger) {
                break;
            }
            System.out.println();
        }
    }
}
