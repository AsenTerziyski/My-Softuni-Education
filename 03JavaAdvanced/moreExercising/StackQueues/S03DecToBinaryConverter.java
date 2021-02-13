import java.util.ArrayDeque;
import java.util.Scanner;

public class S03DecToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.valueOf(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (decimal !=0) {
            while (decimal != 0) {
                int i = decimal % 2;
                stack.push(i);
                decimal = decimal / 2;
            }
            // System.out.println(stack.size());
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        } else {
            System.out.println(0);
        }
    }
}
