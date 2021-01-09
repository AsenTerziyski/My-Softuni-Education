import java.util.Scanner;

public class arrExrc04ArrayRotationRotateFromLastToFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int rotation = Integer.parseInt(scanner.nextLine());
        rotateArrayFromLastToFirst(inputLine, rotation);
        String[] array = rotateArrayFromLastToFirst(inputLine,rotation);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static String[] rotateArrayFromLastToFirst(String inputLine, int rotation) {
        String[] array = inputLine.split(" ");
        for (int i = 1; i <= rotation; i++) {
            String tempLastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = tempLastValue;
        }
        return array;
    }
}
