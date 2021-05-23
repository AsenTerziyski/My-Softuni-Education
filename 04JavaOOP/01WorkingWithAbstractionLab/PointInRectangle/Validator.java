package Exercising.PointInRectangle;

public class Validator {

    public static boolean validatePoint(Point leftBottom, Point rightTop, Point point) {
        int leftBottomX = leftBottom.getX();
        int leftBottomY = leftBottom.getY();

        int rightTopX = rightTop.getX();
        int rightTopY = rightTop.getY();

        int x = point.getX();
        int y = point.getY();

        if (x >= leftBottomX && x <= rightTopX) {
            if (y >= leftBottomY && y <= rightTopY) {
                return true;
            }
        }
        throw new IllegalArgumentException(ExceptionMessages.PointNotINRectangle);
    }
}
