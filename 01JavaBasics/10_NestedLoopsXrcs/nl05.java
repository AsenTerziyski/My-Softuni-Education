package com.company;

import java.util.Scanner;

public class nl05 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        int symbOne = 1;
        int symbTwo = 1;
        char symbThree = 'a';
        char symbFour = 'a';
        int symbFive = 1;

        for (symbOne = 1; symbOne <= n; symbOne++) {
            for (symbTwo = 1; symbTwo <= n; symbTwo++) {
                for (symbThree = 'a'; symbThree < ('a' + l); symbThree++) {
                    for (symbFour = 'a'; symbFour < ('a' + l); symbFour++) {
                        for (symbFive = 1; symbFive <= n; symbFive++) {
                            if (symbFive > symbOne && symbFive > symbTwo) {
                                System.out.printf("%d%d%c%c%d ", symbOne, symbTwo, symbThree, symbFour, symbFive);
                            }
                        }
                    }
                }
            }
        }
    }
}
