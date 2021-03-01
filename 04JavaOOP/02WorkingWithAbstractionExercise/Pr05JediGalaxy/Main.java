package Pr05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = readPositions(scanner.nextLine());
        Galaxy galaxy = new Galaxy(new Field(dimensions[0], dimensions[1]));

        long starPowerCollected = 0;
        String positions = scanner.nextLine();
        while (!positions.equals("Let the Force be with you")) {
            int[] jediPositions = readPositions(positions);
            int[] sithPositions = readPositions(scanner.nextLine());

            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];

            int rowSith = sithPositions[0];
            int colSith = sithPositions[1];
            galaxy.moveSith(rowSith, colSith);

            starPowerCollected += galaxy.moveJedi(rowJedi, colJedi);
            positions = scanner.nextLine();
        }

        System.out.println(starPowerCollected);
    }

    private static int[] readPositions(String positions) {
        return Arrays
                .stream(positions.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
