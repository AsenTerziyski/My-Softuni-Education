import java.util.ArrayList;
import java.util.Scanner;


public class OCDemo01 {
        static class Rezervation {
            // с този клас описвам на Джава нов тип данни
            String holderName;
            String phoneNumber;
            int seats;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Rezervation> rezervations = new ArrayList<>();
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] nameAndSeats = input.split(" ");
            String holders = nameAndSeats[0];
            String gsm = nameAndSeats[1];
            int seats = Integer.parseInt(nameAndSeats[2]);

            Rezervation r = new Rezervation();
            r.holderName = holders;
            r.phoneNumber = gsm;
            r.seats = seats;
            //reservations e list
            rezervations.add(r);
            input = scanner.nextLine();
        }

        String guestName = scanner.nextLine();
        int rezervationIndex = -1;
        for (int i = 0; i < rezervations.size(); i++) {
            Rezervation reservation = rezervations.get(i);
            if (guestName.equals(reservation.holderName)) {
                rezervationIndex = i;
            }
        }

        if (rezervationIndex != -1) {
            Rezervation reservation = rezervations.get(rezervationIndex);
            System.out.println(reservation.phoneNumber);
            System.out.println(reservation.seats);
            //System.out.println(rezervationPlaces.get(rezervationIndex));
        } else {
            System.out.println("No rezervation for " + guestName);
        }

    }
}
