import java.util.Scanner;

public class x02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int devider = 0;

        if (number % 10 == 0) {
            devider = 10;
        } else if (number % 7 == 0) {
            devider = 7;
        } else if (number % 6 == 0) {
            devider = 6;
        } else if (number % 3 == 0) {
            devider = 3;
        } else if (number % 2 == 0) {
            devider = 2;
        }

        if (devider == 10 || devider == 7 || devider == 6 || devider == 3 || devider == 2) {
            System.out.printf("The number is divisible by %d", devider);
        } else {
            System.out.print("Not divisible");
        }
    }
}

