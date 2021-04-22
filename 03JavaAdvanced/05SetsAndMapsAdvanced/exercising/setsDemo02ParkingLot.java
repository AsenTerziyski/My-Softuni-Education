import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setsDemo02ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> carNumbers = new HashSet<>();
        while (!input.equalsIgnoreCase("end")) {
            String[] tokens = input.split(", ");
            switch (tokens[0]) {
                case "IN":
                    carNumbers.add(tokens[1]);
                    break;
                case "OUT":
                    if (!carNumbers.isEmpty()) {
                        carNumbers.remove(tokens[1]);
                    } else {
                        parkingException("ParkingLotIsEmpty!");
                        return;
                    }
                    break;
                default:
                    parkingException("WrongCommand");
            }
            input = scanner.nextLine();
        }

        if (!carNumbers.isEmpty()) {
            carNumbers.stream().forEach(System.out::println);
        } else {
            System.out.println("ParkingLotIsEmpty!");
            parkingException("ParkingLotIsEmpty!");
        }

    }

    private static void parkingException(String s) {
        throw new IllegalArgumentException(s);
    }
}
