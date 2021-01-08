import java.util.Scanner;

public class x05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        String passWord = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            passWord = passWord + String.format("" + currentSymbol);

        }
        String input = scanner.nextLine();
        int countUnsuxeed = 0;
        while (!input.equals(passWord)) {

            countUnsuxeed = countUnsuxeed + 1;
            if (countUnsuxeed == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (input.equals(passWord)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
