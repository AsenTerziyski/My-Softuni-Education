import java.util.Scanner;

public class ME05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int nWorkers = Integer.parseInt(scanner.nextLine());

        double daysRazpolagaemi = days - days * 0.10;
        double hoursRazpolagaemi = (daysRazpolagaemi * 8);
        double hoursIzvanredni = (nWorkers * days * 2);
        double hours = Math.floor(hoursRazpolagaemi + hoursIzvanredni);

        if (neededHours > hours) {
            System.out.printf("Not enough time!%.0f hours needed.", neededHours - hours);
        } else {
            System.out.printf("Yes!%.0f hours left.", hours - neededHours);
        }
    }
}
