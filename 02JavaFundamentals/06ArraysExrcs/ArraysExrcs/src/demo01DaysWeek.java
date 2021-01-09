import java.util.Scanner;

public class demo01DaysWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysWeek = {"Monday", "Sunday"};
        String output = String.join("\n", daysWeek);
        System.out.println(output);

    }
}
