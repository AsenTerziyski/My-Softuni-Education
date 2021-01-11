import java.util.Scanner;

public class WL09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int with = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeVolume = with * length * height;

        String inputText = scanner.nextLine();
        int totalVolumeBoxes = 0;
        boolean freeSpace = true;

        while (!inputText.equals("Done")) {
            int number = Integer.parseInt(inputText);
            totalVolumeBoxes = totalVolumeBoxes + number;

            if (totalVolumeBoxes > freeVolume) {
                freeSpace = false;
                break;
            }

            inputText = scanner.nextLine();
        }

        int diff = Math.abs(freeVolume - totalVolumeBoxes);

        if (freeSpace) {
            System.out.printf("%d Cubic meters left.", diff);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        }

    }
}
