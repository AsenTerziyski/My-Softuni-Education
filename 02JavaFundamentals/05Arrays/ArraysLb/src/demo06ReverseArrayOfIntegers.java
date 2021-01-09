import java.util.Scanner;

public class demo06ReverseArrayOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printReversedArray(n);

    }

    private static void printReversedArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arrNormal = new int[n];
        for (int i = 0; i < arrNormal.length; i++) {
            arrNormal[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] arrReversed = new int[n];
        for (int i = 0; i < arrReversed.length; i++) {
            arrReversed[i] = arrNormal[arrNormal.length - 1 - i];
            System.out.println(arrReversed[i]);
        }
    }
}

