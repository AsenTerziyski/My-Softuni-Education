import java.util.Scanner;

public class x03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        double a1 = 1.00 * (x1 - x2);
        double b1 = 1.00 * (y1 - y2);
        double firstLineLenght = calcLengthOfLine(a1, b1);

        double a2 = 1.00 * (x3 - x4);
        double b2 = 1.00 * (y3 - y4);
        double secondLineLenght = calcLengthOfLine(a2, b2);

        if (firstLineLenght > secondLineLenght) {
            findPrintClosestToZeroPoint(x1, y1, x2, y2);
        } else if (secondLineLenght > firstLineLenght) {
            findPrintClosestToZeroPoint(x3,y3, x4,y4);
        } else {
            findPrintClosestToZeroPoint(x1, y1, x2, y2);
        }

    }

    private static void findPrintClosestToZeroPoint(int x1, int y1, int x2, int y2) {
        double a1 = Math.sqrt(x1 * x1 + y1 * y1);
        double a2 = Math.sqrt(x2 * x2 + y2 * y2);
        if (a1 < a2) {
            System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        } else if (a2 < a1) {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        }
    }

    private static double calcLengthOfLine(double a1, double b1) {
        double lengthOfLine = Math.sqrt(1.00 * (a1 * a1 + b1 * b1));
        return lengthOfLine;
    }

}
