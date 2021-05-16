import java.util.Scanner;

public class x01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "int":
                int n = Integer.parseInt(scanner.nextLine());
                printIntMultiplyayByTwo(n);
                break;
            case "real":
                double num = Double.parseDouble(scanner.nextLine());
                printDblMultiplyByOnePointFive(num);
                break;
            case "string":
                String inputString = scanner.nextLine();
                surroundStringWith$(inputString);
                break;
        }
    }

    private static void surroundStringWith$(String inputString) {
        System.out.println("$" + inputString + "$");
    }

    private static void printDblMultiplyByOnePointFive(double var) {
        System.out.printf("%.2f", var * 1.5);
    }

    private static void printIntMultiplyayByTwo(int n) {
        System.out.println(n * 2);
    }
}
