import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP11PartyReservationFilterModule {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Predicate<String>> predicatesMap = new HashMap<>();

        String inputLine = scanner.nextLine();
        while (!"print".equalsIgnoreCase(inputLine)) {
            String[] tokens = inputLine.split(";");
            String predicateName = tokens[1] + tokens[2];

            if (tokens[0].contains("Add")) {
                Predicate<String> predicate = getPredicate(tokens);
                predicatesMap.put(predicateName, predicate);
            } else {
                predicatesMap.remove(predicateName);
            }

            inputLine = scanner.nextLine();
        }

        guests
                .stream()
                .filter(gst -> {

                    boolean isValid = true;
                    for (Predicate<String> predicate : predicatesMap.values()) {
                        if (predicate.test(gst)) {
                            isValid = false;
                            break;
                        }
                    }
                    return isValid;
                })
                .forEach(e -> System.out.print(e + " "));

    }

    private static Predicate<String> getPredicate(String[] tokens) {
        Predicate<String> predicate = null;

        if ("Starts with".equals(tokens[1])) {
            predicate = name -> name.startsWith(tokens[2]);
        } else if ("Ends with".equals(tokens[1])) {
            predicate = name -> name.endsWith(tokens[2]);
        } else if ("Length".equals(tokens[1])) {
            predicate = name -> name.length() == Integer.parseInt(tokens[2]);
        } else {// contains case:
            predicate = name -> name.contains(tokens[2]);
        }

        return predicate;
    }
}
