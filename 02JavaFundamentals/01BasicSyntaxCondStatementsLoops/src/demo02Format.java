import java.util.Scanner;

public class demo02Format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int roomNumber = Integer.parseInt(scanner.nextLine());

        String dataClient = String.format("Name of client is: %s %s. His age is: %d", firstName, lastName, age);
        String dataProba = String.format("%s. His room is No %d.", dataClient, roomNumber);

        System.out.println(dataProba);

    }
}
