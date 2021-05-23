package Exercising.PointInRectangle;

public class RectangleCreator {
    public static Rectangle createRectangle (int x1, int y1, int x2, int y2) {
        Point bottomLeft = PointCreator.createPoint(x1, y1);
        Point topRight = PointCreator.createPoint(x2, y2);
        return new Rectangle(bottomLeft, topRight);

    }
}
