import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Z05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String username = tokens[1];
            switch (command) {
                case "register":
                    String palteNumber = tokens[2];
                    if (users.containsKey(username)) {
                        System.out.println("ERROR: already registered with plate number " + palteNumber);
                    } else {
                        users.put(username, palteNumber);
                        System.out.println(String.format("%s registered %s successfully", username, palteNumber));
                    }
                    break;
                case "unregister":
                    if (users.containsKey(username)) {
                        users.remove(username);
                        System.out.println(String.format("%s unregistered successfully", username));
                    } else {
                        System.out.println(String.format("ERROR: user %s not found", username));
                    }
                    break;
            }

        }

        users.
                forEach((k, v) -> System.out.println(String.format("%s => %s", k, v)));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");


        users
                .entrySet()
                .stream().sorted((first, second)-> {
                   int result = first.getKey().compareTo(second.getKey());
                   if (result == 1) {
                       result = first.getValue().compareTo(second.getValue());
                   }
                   return result;

        })
                .forEach(e ->
                        System.out.println(String.format("%s => %s", e.getKey(), e.getValue())));

    }
}
