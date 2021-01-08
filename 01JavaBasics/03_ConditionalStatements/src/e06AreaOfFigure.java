import java.util.Scanner;

public class e06AreaOfFigure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();
        double figureArea = 0.00;

        if (figureType.equals("square")) {
            double squareSide = Double.parseDouble(scanner.nextLine());
            figureArea = squareSide * squareSide;

        } else if (figureType.equals("rectangle")) {
            double rectangleSideA = Double.parseDouble(scanner.nextLine());
            double rectangleSideB = Double.parseDouble(scanner.nextLine());
            figureArea = rectangleSideA * rectangleSideB;

        } else if (figureType.equals("triangle")) {
            double triangleSide = Double.parseDouble(scanner.nextLine());
            double trianleHeight = Double.parseDouble(scanner.nextLine());
            figureArea = triangleSide * trianleHeight / 2;

        } else if (figureType.equals("circle")) {
            double circleRadius = Double.parseDouble(scanner.nextLine());
            figureArea = circleRadius * circleRadius * Math.PI;
        }

        System.out.printf("%.3f", figureArea);

    }
}
