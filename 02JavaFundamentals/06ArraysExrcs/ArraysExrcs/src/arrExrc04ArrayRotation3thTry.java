import java.util.Scanner;

public class arrExrc04ArrayRotation3thTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rotations = Integer.parseInt(scanner.nextLine());
        String[] array = input.split(" ");

        for (int i = 1; i <= rotations; i++) {
            String temp = array[0];
            for (int j = 0; j <array.length-1; j++) {
                array[j] = array[j+1];
            }
            array[array.length - 1] = temp;
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
