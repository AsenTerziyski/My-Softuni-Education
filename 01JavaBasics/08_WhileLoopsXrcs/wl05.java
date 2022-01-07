package com.company;

import java.util.Scanner;

public class wl05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double changeLv = Double.parseDouble(scanner.nextLine());
        double changeStotinki = Math.round(changeLv * 100);
        int countCoins = 0;
        while (changeStotinki > 0) {
            if (changeStotinki >= 200) {
                changeStotinki = changeStotinki-200;
                countCoins++;
            } else if (changeStotinki >= 100) {
                changeStotinki = changeStotinki -100;
                countCoins++;
            } else if (changeStotinki >= 50) {
                changeStotinki = changeStotinki -50;
                countCoins++;
            } else if (changeStotinki >= 20) {
                changeStotinki = changeStotinki -20;
                countCoins++;
            } else if (changeStotinki >= 10) {
                changeStotinki = changeStotinki -10;
                countCoins++;
            } else if (changeStotinki >= 5) {
                changeStotinki = changeStotinki -5;
                countCoins++;
            } else if (changeStotinki >= 2) {
                changeStotinki = changeStotinki -2;
                countCoins++;
            } else if (changeStotinki >= 1) {
                changeStotinki = changeStotinki -1;
                countCoins++;
            }
        }
        System.out.println(countCoins);
    }
}
