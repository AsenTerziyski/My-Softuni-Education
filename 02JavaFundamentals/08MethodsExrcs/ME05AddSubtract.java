import java.util.Scanner;

public class ME05AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());

        int sum = add(x,y);
        int result = subtract(sum,z);
        System.out.println(result);

    }

    private static int subtract(int a, int b) {
        int subtract = a - b;
        return subtract;
    }

    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
