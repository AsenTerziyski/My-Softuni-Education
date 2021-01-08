import java.util.Scanner;

public class demo02DateEpochTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        final int unicEpochTimesStartYear = 1970;
        int yearsPassed = year - unicEpochTimesStartYear;

        System.out.println(yearsPassed);
        final long secondsInAyear = 365 * 24 * 60 * 60;

        System.out.println(yearsPassed * secondsInAyear);
    }
}
