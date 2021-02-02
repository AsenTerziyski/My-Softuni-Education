import java.util.Scanner;

public class L04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        operaionPrintResult(command, a, b);

    }

    private static void operaionPrintResult(String command, int a, int b) {
        switch (command) {
            case "add":
                int sum = add(a, b);
                System.out.println(sum);
                break;
            case "multiply":
                int mult = multiply(a, b);
                System.out.println(mult);
                break;
            case "subtract":
                System.out.println(subtract(a,b));
                break;
            case "divide":
                System.out.println(devide(a,b));
                break;
        }
    }

    private static int devide(int a, int b) {
        return a/b;
    }

    private static int subtract(int a, int b) {
        int sub = a - b;
        return sub;
    }

    private static int multiply(int a, int b) {
        int mult = a * b;
        return mult;
    }

    private static int add(int a, int b) {
        int add = a + b;
        return add;
    }
}
