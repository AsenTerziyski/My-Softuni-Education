import java.util.Scanner;

public class CS05TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        // Добавям си проемнлива,  която да сложа 15мин. Може и без нея.
        int plusMinutes = 15;

        // В следващата проемнлива ще слагам часовете, които се получават от мин. Примерно ако е
        // 23: 47 => 47 + 15 = 62мин => това е един час и 2 мин.
        int minutesFromHours = (minutes + plusMinutes) / 60;

        // а в тази променлива слагам остатъка от минутите, примерно 2мин.
        int minutesLeft = (minutes + plusMinutes) % 60;

        // System.out.println(minutesFromHours);
        // System.out.println(minutesLeft);

        // в тези проемнили ще събирам часовете и минутуте за изход
        int hourExit = 0;
        int minExit = 0;

        if (hour >= 0 && hour < 10) {
            hourExit = hour + minutesFromHours;
            minExit = minutesLeft;
            if (minExit < 10) {
                System.out.printf("%d:0%d", hourExit, minExit);
            } else if (minExit >= 10) {
                System.out.printf("%d:%d", hourExit, minExit);
            }

        } else if (hour > 10 && hour < 23) {
            hourExit = hour + minutesFromHours;
            minExit = minutesLeft;
            if (minExit < 10) {
                System.out.printf("%d:0%d", hourExit, minExit);
            } else if (minExit >= 10) {
                System.out.printf("%d:%d", hourExit, minExit);
            }

        } else if (hour == 23) {

            hourExit = hour + minutesFromHours;
            minExit = minutesLeft;

            if (hourExit >= 24) {
                hourExit = 0;
            } else {
                hourExit = 23;
            }

            if (minExit < 10) {
                System.out.printf("%d:0%d", hourExit, minExit);
            } else if (minExit >= 10) {
                System.out.printf("%d:%d", hourExit, minExit);
            }
        }
    }
}
