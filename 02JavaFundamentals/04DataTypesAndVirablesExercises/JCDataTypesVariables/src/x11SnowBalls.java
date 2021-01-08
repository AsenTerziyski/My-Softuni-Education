import java.util.Scanner;

public class x11SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberOfSnowBallsN = Long.parseLong(scanner.nextLine());
        //•	On the first line you will get the snowballSnow – an integer.
        //•	On the second line you will get the snowballTime – an integer.
        //•	On the third line you will get the snowballQuality – an integer.
        long snowballValue = 0;
        long highestSnowballValue = Long.MIN_VALUE;
        long bestSnowlballSnow = 0;
        long bestsnowllballTime = 0;
        long bestsnowllballQuality = 0;

        for (int i = 1; i <= numberOfSnowBallsN; i++) {
            long snowballSnow = Long.parseLong(scanner.nextLine());
            long snowballTime = Long.parseLong(scanner.nextLine());
            long snowballQuality = Long.parseLong(scanner.nextLine());

            //(snowballSnow / snowballTime) ^ snowballQuality
            snowballValue = (long) Math.pow((1.00 * snowballSnow / snowballTime), snowballQuality);

            if (highestSnowballValue < snowballValue) {
                //{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})
                highestSnowballValue = snowballValue;
                bestSnowlballSnow = snowballSnow;
                bestsnowllballTime = snowballTime;
                bestsnowllballQuality = snowballQuality;
            }

        }

        System.out.printf("%d : %d = %d (%d)",
                bestSnowlballSnow,
                bestsnowllballTime,
                highestSnowballValue,
                bestsnowllballQuality);

    }
}
