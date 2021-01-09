import java.util.Scanner;

public class ME02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vacationDays = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - vacationDays;
        int realTimePlayInMinutes = workDays * 63 + vacationDays * 127;

        int diference = 30000 - realTimePlayInMinutes;

        int hoursPlayExit = Math.abs(diference / 60);
        int minutesPlayExit = Math.abs(diference % 60);

        if (realTimePlayInMinutes > 30000) {
            System.out.print("Tom will run away");
            System.out.println();
            System.out.printf("%d hours and %d minutes more for play", hoursPlayExit, minutesPlayExit);

        } else {
            System.out.print("Tom sleeps well");
            System.out.println();
            System.out.printf("%d hours and %d minutes less for play", hoursPlayExit, minutesPlayExit);
        }
    }
}
