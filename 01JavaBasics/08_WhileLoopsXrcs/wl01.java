package com.company;

import java.util.Scanner;

public class wl01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        String inputText = scanner.nextLine();

        int countBooks = 0;
        boolean isFound = false;

        while (!inputText.equals("No More Books")) {

            if (inputText.equals(bookName)) {
                isFound = true;
                break;
            }
            countBooks = countBooks + 1;
            inputText = scanner.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
