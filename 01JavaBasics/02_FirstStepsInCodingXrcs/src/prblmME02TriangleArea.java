import java.util.Scanner;

public class prblmME02TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double areaTriangle = a * h / 2;

        System.out.printf("%.2f", areaTriangle);

    }
}
