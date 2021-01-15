import java.util.Scanner;

public class SQ01demoLB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[32];
        int cell = Integer.BYTES;
        // инт заема 4 байта * броя на елементите => 4 * 32 = 128:
        System.out.println(cell);
        System.out.println(numbers.length * cell);
    }
}
