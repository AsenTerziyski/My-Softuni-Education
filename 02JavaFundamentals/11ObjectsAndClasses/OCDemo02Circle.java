import java.util.Scanner;

public class OCDemo02Circle {
    static class Circle {

        // poleta v klasa
        double radius;

        // mevdu poletata i metodite se pishe konstruktora. Toj nosi imeto na klasa:
        Circle (double radius) {
            // Ako radius e s imeto na radius, a ne drugo tryabva da pisha this.":
            this.radius = radius;
            //radius = radiusKonstr;
        }


        // metodi v klasa:
        double getArea() {
            double area = radius * radius * Math.PI;
            return area;
        }
        void scale(double factor) {
            radius = radius * factor;
        }
        // what is POJO in Java?
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radiusInput = Double.parseDouble(scanner.nextLine());
        Circle demoCircle = new Circle(radiusInput);
        demoCircle.scale(2);
        System.out.println(demoCircle.getArea());

        double radiusInput2 = Double.parseDouble(scanner.nextLine());
        Circle demoCircle2 = new Circle(radiusInput2);
        demoCircle2.scale(10);
        System.out.println(demoCircle2.getArea());

    }
}
