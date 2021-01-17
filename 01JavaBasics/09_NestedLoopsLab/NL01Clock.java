import java.util.Scanner;

public class NL01Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = 0;
        int minutes = 0;

        for (hours = 0; hours <= 23; hours++) {
            for (minutes = 0; minutes <= 59; minutes++) {
                System.out.printf("%d:%d%n", hours, minutes);
            }
        }

    }
}
