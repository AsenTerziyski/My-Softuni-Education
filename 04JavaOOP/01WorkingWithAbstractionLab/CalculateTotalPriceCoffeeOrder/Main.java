package CalculateTotalPriceCoffeeOrder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0.00;
        while (!input.equalsIgnoreCase("end")) {

            sum = getTotalSum(input, sum);

            input = scanner.nextLine();
        }

        System.out.println("xxxxxxxxxxxx");
        System.out.println(String.format("TOTAL SUM: %.2f BGN", sum));
        System.out.println("ORDER FINISHED");
        System.out.println("xxxxxxxxxxxx");

    }

    private static double getTotalSum(String input, double sum) {
        String[] tokens = input.split(", ");
        Coffee coffee = Coffee.valueOf(tokens[0].toUpperCase());
        int number = Integer.parseInt(tokens[1]);

        CalculateCoffeePrice calculateCoffeePrice = new CalculateCoffeePrice(coffee, number);
        sum = sum + calculateCoffeePrice.getTotalPrice();
        System.out.print(String.format("Added %d -  %s:", number, tokens[0].toUpperCase()));
        System.out.println(String.format("  current SUM: %.2f BGN", sum));
        System.out.println("------------------------------------------");
        return sum;
    }

    static {
        System.out.println("xxxxxxxxxxxx");
        System.out.println("START ORDER:");
    }
}
