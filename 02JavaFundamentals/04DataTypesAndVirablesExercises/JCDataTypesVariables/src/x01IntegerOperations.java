import java.util.Scanner;

public class x01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());
        intOperations(first, second, third, fourth);
    }

    private static void intOperations(int first, int second, int third, int fourth) {
        int sum = first + second;
        int devide = sum / third;
        int multiply = devide * fourth;
        System.out.println(multiply);
    }
}
