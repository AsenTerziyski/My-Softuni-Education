package demoShape;

public class Main {
    public static void main(String[] args) {
        DemoShape demoShape = new DemoRectangle(2.2,2.2);
        System.out.println(demoShape.calculateArea());
        System.out.println(demoShape.calculatePerimeter());

        DemoShape demoShape1 = new DemoSquare(2.0);
        System.out.println(demoShape1.calculatePerimeter());
        System.out.println(demoShape1.calculateArea());

        DemoShape circle = new DemoCircle(1.0);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

    }
}
