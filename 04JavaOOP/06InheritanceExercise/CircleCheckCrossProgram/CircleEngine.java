package CircleCheckCrossProgram;

import java.util.Scanner;

class CircleEngine {


    static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circles data in format: x1 y1 r1;x2 y2 r2");

        String[] input = scanner.nextLine().split(";");
        Circle circle1 = CircleCreator.createCircle(input, 0);
        Circle circle2 = CircleCreator.createCircle(input, 1);
        CircleChecker.checkCircles(circle1, circle2);

//        Circle circle1 = getCircle(input, 0);
//        Circle circle2 = getCircle(input, 1);


    }

//    private static Circle getCircle(String[] input, int i) {
//        String[] circle1data = input[i].split(" ");
//        double x1 = Double.parseDouble(circle1data[0]);
//        double y1 = Double.parseDouble(circle1data[1]);
//        double r1 = Double.parseDouble(circle1data[2]);
//        Point2D c1 = new Point2D(x1, y1);
//        return new Circle(c1, r1);
//    }
}
