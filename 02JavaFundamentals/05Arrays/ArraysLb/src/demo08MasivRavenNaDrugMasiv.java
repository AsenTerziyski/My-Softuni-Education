import java.util.Scanner;

public class demo08MasivRavenNaDrugMasiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");

        int[] inputArrNum = new int[inputArr.length];
        for (int i = 0; i < inputArrNum.length; i++) {
            inputArrNum[i] = Integer.parseInt(inputArr[i]);
        }

        int[] exitArr = inputArrNum;

        for (int i = 0; i <exitArr.length; i++) {
            System.out.println(exitArr[i]);
        }
    }
}
