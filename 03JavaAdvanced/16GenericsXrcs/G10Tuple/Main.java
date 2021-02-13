package G10Tuple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        String name = String.format("%s %s", tokens[0], tokens[1]);
        String address = tokens[2];
        Tuple<String, String> tuple = new Tuple<>(name, address);
        System.out.println(tuple);

        tokens = scanner.nextLine().split("\\s+");
        name = String.format("%s", tokens[0]);
        int liters = Integer.parseInt(tokens[1]);
        Tuple<String, Integer> personBeer = new Tuple<>(name, liters);
        System.out.println(personBeer);

        tokens = scanner.nextLine().split("\\s+");
        int intg = Integer.parseInt(tokens[0]);
        double dbl = Double.parseDouble(tokens[1]);
        Tuple<Integer, Double> IntegerDouble = new Tuple<>(intg, dbl);
        System.out.println(IntegerDouble);

        // write your code here
    }
}
