package Pr04FirstAndReserveTeam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Team team = new Team("Black Eagles");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String firstName = tokens[0];
            String secondName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            double salary = Double.parseDouble(tokens[3]);
            Person p = new Person(firstName, secondName, age, salary);
            team.addPlayer(p);
        }
        System.out.println(String.format("First team have %d players", team.getFirstTeam().size()));
        System.out.println(String.format("Reserve team have %d players", team.getReserveTeam().size()));
        //team.getFirstTeam().clear();
    }
}
