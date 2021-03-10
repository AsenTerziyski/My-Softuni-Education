package Pr06Ferrari;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String driverName = scanner.nextLine();
        Car ferrari = new Ferrari(driverName);
        System.out.println(ferrari.toString());
    }
}
