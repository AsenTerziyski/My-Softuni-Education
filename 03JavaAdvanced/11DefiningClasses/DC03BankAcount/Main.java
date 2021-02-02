package DC03BankAcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            BankAccount bankAccount = new BankAccount();
//            System.out.println(bankAccount.getId());
//            // ако е:
//            // private int accountsCount = 1 , т.е без static, ще отпечатва само 1
//        }

        Map<Integer, BankAccount> vault = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("End")) {
            String[] tokens = input.split("\\s+");

            String output;
            switch (tokens[0]) {
                default:
                    BankAccount bankAccount = new BankAccount();
                    vault.put(bankAccount.getId(), bankAccount);
                    int currentId = bankAccount.getId();
                    output = "Account ID" + currentId + " created";
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);

                    if (vault.containsKey(id)) {
                        vault.get(id).deposit(amount);
                        output = String.format("Deposited %d to ID%d", amount, id);
                    } else {
                        output = "Account does not exist";
                    }

                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(newInterest);
                    output = null;
                    break;
                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);

                    if (vault.containsKey(id)) {
                        double interest = vault.get(id).getInterest(years);
                        output = String.format("%.2f", interest);
                    } else {
                        output = "Account does not exist";
                    }

                    break;
            }

            if (output != null) {
                System.out.println(output);
            }

            input = scanner.nextLine();
        }

    }
}
