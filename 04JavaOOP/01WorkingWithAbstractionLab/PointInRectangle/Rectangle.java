package Exercising.PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains (Point point) {
        Validator.validatePoint(this.bottomLeft, this.topRight, point);
        return true;
    }

}
