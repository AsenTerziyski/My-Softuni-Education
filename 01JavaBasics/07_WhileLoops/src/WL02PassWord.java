import java.util.Scanner;

public class WL02PassWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String passWord = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals(passWord)) {
            input = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", userName);
    }
}
