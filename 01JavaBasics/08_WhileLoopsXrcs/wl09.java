package com.company;

import java.util.Scanner;

public class wl09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =1;
        while (i<=100) {
            if (i%3==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
