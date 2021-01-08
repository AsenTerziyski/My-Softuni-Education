import java.util.Scanner;

public class prblm07VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pageNumbers = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRead = Integer.parseInt(scanner.nextLine());

        int hoursTotalToRead = pageNumbers / pagesPerHour;
        int hoursPerDay = hoursTotalToRead / daysToRead;

        System.out.print(hoursPerDay);
    }
}
