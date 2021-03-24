import java.util.Scanner;

public class pr03Fixing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weekdays = new String[5];
        String[] weekend = new String[]{"Saturday", "Sunday"};
        weekdays[0] = "Monday";
        weekdays[1] = "Tuesday";
        weekdays[2] = "Wednesday";
        weekdays[3] = "Thursday";
        weekdays[4] = "Friday";

//        for (int i = 0; i <= weekdays.length; i++) {
//            System.out.println(weekdays[i]);
//        }

        try {
            for (int i = 0; i < weekdays.length; i++) {
                System.out.println(weekdays[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("Test:");
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
            System.out.println("Weekends are:");
            for (String s : weekend) {
                System.out.println(s);
            }
        }

    }
}
