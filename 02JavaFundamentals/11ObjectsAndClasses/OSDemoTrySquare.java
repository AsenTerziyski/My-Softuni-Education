import java.util.Scanner;

public class OSDemoTrySquare {

    static class Square {
        double a;
        //Конструкторът има име само като на класа:
        public Square(double a) {
            this.a = a;
        }

        public double getArea() {
            return a * a;
        }
        public double getPerimeter() {
            return 4*a;
        }
    }

    static class Circle {
        double a;
        public Circle (double r) {
            this.a = r;
        }
        public double getCircleArea () {
            return Math.PI*Math.pow(a,2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side = Double.parseDouble(scanner.nextLine());
        Square sq = new Square(side);
        estimatingSquareAreaAndPerimeter(sq);
        estimatingCircleArea(side);

    }

    private static void estimatingCircleArea(double side) {
        double radius = side;
        Circle crcl = new Circle(radius);
        double areaCirlce = crcl.getCircleArea();
        System.out.printf("%.2f",areaCirlce);
    }

    private static void estimatingSquareAreaAndPerimeter(Square sq) {
        double area = sq.getArea();
        double perimeter = sq.getPerimeter();
        System.out.println(area);
        System.out.println(perimeter);
    }
}
