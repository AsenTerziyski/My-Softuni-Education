import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SM01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parking = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String registration = input.substring(input.indexOf(", ") + 1);

            if (input.contains("IN")) {
                parking.add(registration);
            } else {
                parking.remove(registration);
            }

            input = scanner.nextLine();
        }

        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            parking
                    .stream()
                    .forEach(str -> System.out.println(str));
//            String output = parking.stream().collect(Collectors.joining(System.lineSeparator()));
//            System.out.println(output);
//
//            parking.stream().sorted((s1, s2) -> s2.compareTo(s1))
//                    .forEach(str -> System.out.println(str));
        }
    }
}
