import java.util.Scanner;

public class L06RectArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double with = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.0f",rectangularArea(with, height));
    }

    private static double rectangularArea(double w, double h) {
        return (w * h);
    }
}
