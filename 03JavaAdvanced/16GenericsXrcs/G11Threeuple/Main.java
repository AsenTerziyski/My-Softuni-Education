package G11Threeuple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        String name = String.format("%s %s", tokens[0], tokens[1]);
        String address = tokens[2];
        String town = tokens[3];
        Tuple<String , String, String> fullAddress = new Tuple<>(name, address, town);
        System.out.println(fullAddress);

        tokens = scanner.nextLine().split("\\s+");
        name = String.format("%s", tokens[0]);
        int liters = Integer.parseInt(tokens[1]);
        String drunkOrNot = tokens[2];
        boolean isDrunk = true;
        if (!drunkOrNot.equalsIgnoreCase("drunk")){
            isDrunk = false;
        }
//        else {
//            isDrunk = false;
//        }
        Tuple<String, Integer, Boolean > personBeer = new Tuple<>(name, liters, isDrunk);
        System.out.println(personBeer);

        tokens = scanner.nextLine().split("\\s+");
        name = String.format("%s", tokens[0]);
        double accountBalance = Double.parseDouble(tokens[1]);
        String accountBalanceToString = String.format("%.1f", accountBalance);
        String bankName = tokens[2];
        Tuple<String, String, String> bankInfo = new Tuple<>(name, accountBalanceToString, bankName);
        System.out.println(bankInfo);

        // write your code here
    }
}
