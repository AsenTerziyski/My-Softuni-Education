package Pr02Geometry;

import IOUtils.ConsoleReader;
import IOUtils.InputParser;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ConsoleReader reader = new ConsoleReader();
        int[] rectangleInfo = InputParser.parseArray(reader.readLine(), "\\s+");
        Rectangle rectangle = GeometryFactory.createRectangle(rectangleInfo);
        int number = Integer.parseInt(reader.readLine());

        while (number-- > 0) {
            int[] pointInfo = InputParser.parseArray(reader.readLine(), "\\s+");
            Point2D currentPoint2D = GeometryFactory.createPoint2D(pointInfo);
            System.out.println(rectangle.contains(currentPoint2D));
        }
//        Scanner scanner = new Scanner(System.in);
//        Rectangle rectangle = getRectangle(scanner);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < n; i++) {
//            Point2D currentPoint = getPoint2D(scanner);
//            System.out.println(rectangle.contains(currentPoint));
//        }
    }

//    private static Point2D getPoint2D(Scanner scanner) {
//        int[] pointCoordinates = getCoordinates(scanner);
//        int x = pointCoordinates[0];
//        int y = pointCoordinates[1];
//        return new Point2D(x, y);
//    }
//    private static Rectangle getRectangle(Scanner scanner) {
//        int[] rectangleCoordinates = getCoordinates(scanner);
//        int bottomLeftX = rectangleCoordinates[0];
//        int bottomLeftY = rectangleCoordinates[1];
//        int topRightX = rectangleCoordinates[2];
//        int topRightY = rectangleCoordinates[3];
//        return new Rectangle(new Point2D(bottomLeftX, bottomLeftY), new Point2D(topRightX, topRightY));
//    }
//    private static int[] getCoordinates(Scanner scanner) {
//        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//    }
}
