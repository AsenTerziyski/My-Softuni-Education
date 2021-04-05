package demo02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EnterCoffeeType:");
        String[] input = scanner.nextLine().split("\\s+");

        switch (input[1]) {
            case "SMALL":
                System.out.println(String.format("%s coffee => %d", CoffeeSize.SMALL, CoffeeSize.SMALL.getCoffeeSize()));
                break;
            case "MIDDLE":
                System.out.println(String.format("%s coffee => %d", CoffeeSize.MIDDLE, CoffeeSize.MIDDLE.getCoffeeSize()));
                break;
            case "BIG":
                System.out.println(String.format("%s coffee => %d", CoffeeSize.BIG, CoffeeSize.BIG.getCoffeeSize()));
                break;
        }
        //inputs Buy SMALL

    }
}
