import java.util.Scanner;

public class demo04ReadingArrayFromSingleLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArr = input.split(" ");

        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%02d%n", arr[i]);
        }

    }
}
