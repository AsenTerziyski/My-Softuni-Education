package Pr03StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        String input = scanner.nextLine();
        while (!input.equals("Exit")) {
            String commandResult = studentSystem.parseCommand(input.split("\\s+"));
            if (commandResult != null) {
                System.out.println(commandResult);
            }
            input = scanner.nextLine();
        }
    }
}
