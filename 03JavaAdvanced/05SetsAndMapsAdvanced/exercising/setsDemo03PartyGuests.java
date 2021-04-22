import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setsDemo03PartyGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vipGuests = new HashSet<>();
        Set<String> otherGuests = new HashSet<>();
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("party")) {
            if (input.trim().isEmpty()) {
                throw new IllegalArgumentException("BothListsAreEmpty!");
            }
            char symbol = input.charAt(0);
            if (Character.isDigit(symbol)) {
                vipGuests.add(input);
            } else {
                otherGuests.add(input);
            }

            input = scanner.nextLine();
        }

        Set<String> vipGuestsWhoCame = new HashSet<>();
        Set<String> otherGuestsWhoCame = new HashSet<>();

        input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {

            if (input.trim().isEmpty()) {
                throw new IllegalArgumentException("BothListsAreEmpty!");
            }

            char symbol = input.charAt(0);
            if (Character.isDigit(symbol)) {
                if (vipGuests.contains(input)) {
                    vipGuestsWhoCame.add(input);
                }
            } else {
                if (otherGuests.contains(input)) {
                    otherGuestsWhoCame.add(input);
                }
            }
            input = scanner.nextLine();
        }


        if (vipGuestsWhoCame.isEmpty()) {
            System.out.println("No VIP guests On Party");
        }

        if (otherGuestsWhoCame.isEmpty()) {
            System.out.println("No other guests On Party");
        }
        int totalGuestsWhoCame = vipGuestsWhoCame.size() + otherGuestsWhoCame.size();

        System.out.println("totalGuestsWhoCame: " + totalGuestsWhoCame);

        vipGuestsWhoCame.stream().forEach(v -> System.out.println("vipGuestWhoCame => " + v));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        otherGuestsWhoCame.stream().forEach(o -> System.out.println("otherGuestWhoCame => " + o));
    }
}
