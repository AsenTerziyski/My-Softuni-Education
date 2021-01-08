import java.util.Scanner;

public class x04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursInput = Integer.parseInt(scanner.nextLine());
        int minutesInput = Integer.parseInt(scanner.nextLine());
        int afterMinutes = 30;

        int timeInMinAfterMinutes = hoursInput * 60 + minutesInput + afterMinutes;

        int hourExit = timeInMinAfterMinutes / 60;
        int minutesExit = timeInMinAfterMinutes % 60;
        if (hourExit < 24) {
            System.out.printf("%d:%02d", hourExit, minutesExit);
        } else {
            hourExit = hourExit - 24;
            System.out.printf("%d:%02d", hourExit, minutesExit);
        }
    }
}
