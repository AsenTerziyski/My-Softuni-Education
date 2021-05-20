import java.util.ArrayList;
import java.util.Scanner;

public class LU03HousePartySecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandsNumber = Integer.parseInt(scanner.nextLine());
        ArrayList<String> guestList = new ArrayList<>();

        for (int i = 0; i < commandsNumber; i++) {
            //String[] input = scanner.nextLine().split(" ");
            // s limit razdelyam do posocheniya broi stringove.
            // Tova ulesnyava zadachata:
            String[] input = scanner.nextLine().split(" ", 2);
            String name = input[0];
            String isOrisNot = input[1];
            switch (isOrisNot) {
                case "is not going!":
                    if (guestList.contains(name)) {
                        guestList.remove(name);
                    } else {
                        System.out.printf("%s is not in the list!%n", name);
                    }
                    break;
                case "is going!":
                    if (guestList.contains(name)) {
                        System.out.printf("%s is already in the list!%n", name);
                    } else {
                        guestList.add(name);
                    }
                    break;
            }
        }

        for (String guests : guestList) {
            System.out.println(guests);
        }
        //printStringWithJoinString(guestList);
    }

    private static void printStringWithJoinString(ArrayList<String> guestList) {
        String outputList = String.join(" ", guestList);
        System.out.println(outputList);
    }
}
