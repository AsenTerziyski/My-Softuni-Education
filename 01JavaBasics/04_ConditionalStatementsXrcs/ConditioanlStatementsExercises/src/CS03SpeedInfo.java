import java.util.Scanner;

public class CS03SpeedInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10) {
            System.out.println("slow");

        } else if (speed > 10 && speed <= 50) {
            System.out.print("average");

        } else if (speed > 50 && speed <= 150) {
            System.out.print("fast");

        } else if (speed > 150 && speed <= 1000) {
            System.out.print("ultra fast");

        } else if (speed > 1000) {
            System.out.print("extremely fast");
        }

    }
}
