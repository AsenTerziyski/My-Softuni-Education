import java.util.Scanner;

public class CS01SumSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThirth = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirst + timeSecond + timeThirth;
        int totalMinutes = totalTime / 60;
        int totalSeconds = totalTime % 60;

        if (totalSeconds < 10) {
            System.out.printf("%d:0%d", totalMinutes, totalSeconds);
        } else {
            System.out.printf("%d:%d", totalMinutes, totalSeconds);
        }
    }
}
