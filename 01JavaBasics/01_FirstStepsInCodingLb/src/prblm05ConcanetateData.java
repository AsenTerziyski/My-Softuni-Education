import java.util.Scanner;

public class prblm05ConcanetateData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.print("You are " + firstName + " " + secondName + ", a " + age + "-years old person from " + town + ".");
    }

}
