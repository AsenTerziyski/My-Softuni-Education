import java.util.Scanner;

public class arr01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDay = Integer.parseInt(scanner.nextLine());

        if (numberOfDay < 1 || numberOfDay > 7) {
            System.out.println("Invalid day!");
        } else {
            String[] dayOfWeek = new String[]{"Monday",
                    "Tuesday", "Wednesday",
                    "Thursday", "Friday",
                    "Saturday", "Sunday"};
            System.out.println(dayOfWeek[numberOfDay - 1]);
        }
    }
}
