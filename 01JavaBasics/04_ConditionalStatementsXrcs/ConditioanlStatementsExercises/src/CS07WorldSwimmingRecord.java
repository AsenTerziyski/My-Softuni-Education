import java.util.Scanner;

public class CS07WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        double timeSwimming = distance * secondsPerMeter;
        // Да внимавам със закръглянето надолу на пътите, с които се забавя на всеки 15м! Трябва да е Math.floor.
        double timeDelay = 12.5 * Math.floor(distance / 15);

        double timeTotal = timeDelay + timeSwimming;
        double difference = Math.abs(timeTotal - worldRecord);

        if (timeTotal < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeTotal);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }

    }
}
