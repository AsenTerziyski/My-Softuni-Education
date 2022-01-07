package com.company;

import java.util.Scanner;

public class nl06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int digitOne = 0;
        int digitTwo = 0;
        int digitThree = 0;
        int digitFour = 0;

        int i = 1111;
        while (i <= 9999) {
            digitOne = i / 1000;
            digitTwo = i / 100 % 10;
            digitThree = i / 10 % 10;
            digitFour = i % 10;
            boolean checkOne = digitOne != 0 && n % digitOne == 0;
            boolean checkTwo = digitTwo != 0 && n % digitTwo == 0;
            boolean checkThree = digitThree != 0 && n % digitThree == 0;
            boolean checkFour = digitFour != 0 && n % digitFour == 0;

            if (checkOne && checkTwo && checkThree && checkFour) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
