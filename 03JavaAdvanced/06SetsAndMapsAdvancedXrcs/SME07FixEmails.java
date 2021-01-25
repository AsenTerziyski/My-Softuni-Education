import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SME07FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // can be solved with RegEx: =>>> .[us|com|uk]+$
        String input = scanner.nextLine();
        Map<String, String> contacts = new LinkedHashMap<>();
        while (!input.equalsIgnoreCase("sTop")) {

            String contactName = input;
            String contactEmail = scanner.nextLine();

            String[] checkEmail = contactEmail.split("\\.");
            String currentDomain = checkEmail[1];

            if (!currentDomain.equals("us") && !currentDomain.equals("uk") && !currentDomain.equals("com")) {
                contacts.putIfAbsent(contactName, contactEmail);
            }

            input = scanner.nextLine();
        }

        contacts
                .entrySet()
                .stream()
                .forEach(cont -> {

                    String currentNameToPrint = cont.getKey();
                    String currentEmailToPrint = cont.getValue();
                    System.out.println(String.format("%s -> %s", currentNameToPrint, currentEmailToPrint));

                });
    }
}
