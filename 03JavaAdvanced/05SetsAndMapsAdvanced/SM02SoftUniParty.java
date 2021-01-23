import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SM02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("party")) {
            String guest = input;

            if (Character.isDigit(guest.charAt(0))) {
                vip.add(guest);
            } else {
                regular.add(guest);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            String guest = input;

            if (Character.isDigit(guest.charAt(0))) {
                vip.remove(guest);
            } else {
                regular.remove(guest);
            }

            input = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        vip.addAll(regular);
        printSet(vip);
        //printSet(regular);

    }

    private static void printSet(Set<String> set) {
//        System.out.println(set
//                .stream().sorted()
//                .collect(Collectors.joining(System.lineSeparator())));
        set.stream().sorted().forEach(s-> System.out.println(s));
    }
}
