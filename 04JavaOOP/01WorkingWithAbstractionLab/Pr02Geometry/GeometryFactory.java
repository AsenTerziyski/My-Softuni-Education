package Pr02Geometry;

public class GeometryFactory {
    public static Rectangle createRectangle(int[] pointsInfo) {
        Rectangle rectangle = new Rectangle(createPoint2D(pointsInfo[0], pointsInfo[1])
                , createPoint2D(pointsInfo[2], pointsInfo[3]));
        return rectangle;
    }

    public static Point2D createPoint2D(int x, int y) {
        Point2D point2D = new Point2D(x, y);
        return point2D;
    }

    public static Point2D createPoint2D(int[] pointsInfo) {
        if (pointsInfo.length != 2) {
            throw new IllegalStateException("Point2D can only be created by X and Y");
        }
        Point2D point2D = createPoint2D(pointsInfo[0], pointsInfo[1]);
        return point2D;
    }
}
