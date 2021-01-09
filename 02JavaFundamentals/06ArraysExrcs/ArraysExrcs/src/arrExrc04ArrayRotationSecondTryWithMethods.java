import java.util.Scanner;

public class arrExrc04ArrayRotationSecondTryWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int rotations = Integer.parseInt(scanner.nextLine());
        String[] array = inputLine.split(" ");
        arrayRotation(rotations, array);
        //след като изпълня метода, понеже
        // аррай е референтен тип, то той се променя. С другу думи няма
        // нужда метода войд да стане ретърн метод.
        System.out.println(String.join(" ", array));
    }

    private static void arrayRotation(int rotations, String[] array) {
        for (int i = 1; i <= rotations; i++) {
            String temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
    }

}
