package com.company;

import java.util.Scanner;

public class wl06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int with = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakeArea = with * length;
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int currentPiessces = Integer.parseInt(input);
            cakeArea = cakeArea - currentPiessces;
            if (cakeArea <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeArea));
                break;
            }
            input = scanner.nextLine();
        }
        if (cakeArea > 0) {
            System.out.printf("%d pieces are left.", cakeArea);
        }
    }
}
