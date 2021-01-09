import java.util.Scanner;

public class arrExrc04ArrayRotationSecondTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] array = inputLine.split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=rotations; i++) {
            String temp = array[0];
            for (int j = 0; j <array.length-1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = temp;
        }

        String outputString = String.join(" ", array);
        System.out.println(outputString);
    }
}
