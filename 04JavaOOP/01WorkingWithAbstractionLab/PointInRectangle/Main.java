package Exercising.PointInRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = getRectangle(scanner.nextLine().split("\\s+"));

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Point point = PointCreator.createPoint(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            System.out.println(rectangle.contains(point));
        }

    }

    private static Rectangle getRectangle(String[] input) {
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        return RectangleCreator.createRectangle(x1,y1,x2,y2);
    }

}
