package Pr02Shapes;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Circle circle = new Circle(1);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

        Shape circle1 = new Circle(1);
        circle1.calculateArea();
        System.out.println(circle1.getArea());
        circle1.calculatePerimeter();
        System.out.println(circle1.getPerimeter());

        Shape rect = new Rectangle(1,2);
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getArea());
        System.out.println(rect.calculatePerimeter());
        System.out.println(rect.calculateArea());

    }
}
