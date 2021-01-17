import java.util.Scanner;

public class NL07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();

        int totalTickets = 0;

        int countStudentTickets = 0;
        int countStandartTickets = 0;
        int countKidTickets = 0;

        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int takenSeats = 0;

            while (true) {
                String ticketType = scanner.nextLine();

                if (ticketType.equals("End")) {
                    break;
                }

                takenSeats++;
                totalTickets++;

                switch (ticketType) {
                    case "student":
                        countStudentTickets++;
                        break;

                    case "standard":
                        countStandartTickets++;
                        break;

                    case "kid":
                        countKidTickets++;
                        break;

                }

                if (takenSeats >= freeSeats) {
                    break;
                }

            }

            double percentTaken = 100.00 * takenSeats / freeSeats;
            System.out.printf("%s - %.2f%% full.%n", movie, percentTaken);
            movie = scanner.nextLine();

        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        double percentStudent = 100.00 * countStudentTickets / totalTickets;
        System.out.printf("%.2f%% student tickets.%n", percentStudent);
        double percentStandart = 100.00 * countStandartTickets / totalTickets;
        System.out.printf("%.2f%% standard tickets.%n", percentStandart);
        double percentKid = 100.00 * countKidTickets / totalTickets;
        System.out.printf("%.2f%% kids tickets.", percentKid);

    }
}
