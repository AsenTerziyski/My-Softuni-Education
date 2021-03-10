package Pr05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> identifiableList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 3) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                Identifiable citizen = new Citizen(name, age, id);
                identifiableList.add(citizen);
            } else if (tokens.length == 2) {
                String model = tokens[0];
                String id = tokens[1];
                Identifiable robot = new Robot(id, model);
                identifiableList.add(robot);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
//            int inputLength = input.length();
        for (int i = 0; i < identifiableList.size(); i++) {
            String currentId = identifiableList.get(i).getId();
//                String lastDigits = currentId.substring(currentId.length() - inputLength, currentId.length());
//                if (lastDigits.equals(input)) {
//                    System.out.println(currentId);
//                }
//            if (currentId.contains(input)) {
//                System.out.println(currentId);
//            }
            if (identifiableList.get(i).getId().contains(input)) {
                System.out.println(identifiableList.get(i).getId());
            }
        }
    }
}
