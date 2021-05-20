import java.util.ArrayList;
import java.util.Scanner;

public class LU03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandsNumber = Integer.parseInt(scanner.nextLine());
        ArrayList<String> guestList = new ArrayList<>();

        for (int i = 0; i < commandsNumber; i++) {
            String[] input = scanner.nextLine().split(" ");
            // String[] inputTwo = scanner.nextLine().split(" ", 2);
            String name = input[0];
            String not = input[2];
            switch (not) {
                case "not":
                    if (guestList.contains(name)) {
                        guestList.remove(name);
                    } else {
                        System.out.printf("%s is not in the list!%n", name);
                    }
                    break;
                default:
                    if (guestList.contains(name)) {
                        System.out.printf("%s is already in the list!%n", name);
                    } else {
                        guestList.add(name);
                    }
                    break;
            }
        }
        //System.out.println();
        for (String guests : guestList) {
            System.out.println(guests);
        }
    }
}
