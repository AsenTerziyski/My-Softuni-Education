import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SME05PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("seaRch")) {

            String[] inputArray = input.split("-");
            String contactName = inputArray[0];
            String contactNumber = inputArray[1];

            phoneBook.putIfAbsent(contactName, contactName);
            if (phoneBook.containsKey(contactName)) {
                phoneBook.put(contactName, contactNumber);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equalsIgnoreCase("stop")) {

            if (phoneBook.containsKey(input)) {
                String numberToPrint = phoneBook.get(input);
                System.out.println(String.format("%s -> %s", input, numberToPrint));
            } else {
                System.out.println(String.format("Contact %s does not exist.", input));
            }

            input = scanner.nextLine();
        }

    }
}
