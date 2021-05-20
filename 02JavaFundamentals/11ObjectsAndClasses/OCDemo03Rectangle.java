import java.util.Scanner;

public class OCDemo03Rectangle {
    static public class Rectangle {
        //трябва да има статик в името на класа!!!!
        double sideA;
        double sideB;

        // konstruktor
//        Rectangle(double sideA, double sideB) {
//            this.sideA = sideA;
//            this.sideB = sideB;
//        }

//        void scale (double factor) {
//            sideA = sideA*factor;
//            sideB = sideB*factor;
//        }

        // гетър:
        public double getRectangleArea() {
            return sideA * sideA;
        }

        // сетър:
        public void setSide(double a, double b) {
            this.sideA = a;
            this.sideB = b;
        }

//        void scale (double factor) {
//            sideA = sideA*factor;
//            sideB = sideB*factor;
//        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        Rectangle demoRect = new Rectangle();
        //demoRect.scale(2);
        demoRect.setSide(a * 10, b * 10);
        //demoRect.scale(10);
        double area = demoRect.getRectangleArea();

        System.out.printf("%.2f", area);
    }
}
