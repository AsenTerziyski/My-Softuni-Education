package demo02;

public class Main {

    public static void main(String[] args) {

        Figure figure = new Figure(1.00);
        System.out.println(figure.calculateArea());

        Rectangle rectangle = new Rectangle(2,5);
        System.out.println(rectangle.calculateArea());

        Circle circle = new Circle(1);
        System.out.println(circle.calculateArea());


	// write your code here
    }
}
