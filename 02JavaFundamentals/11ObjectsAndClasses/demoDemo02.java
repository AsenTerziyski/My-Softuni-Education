import java.util.ArrayList;
import java.util.Scanner;

public class demoDemo02 {
    static class Circle {
        double radiuis;
        double area;

        public Circle(double radiuis) {
            this.radiuis = radiuis;
        }

        public void setRadiuis(double radiuis) {
            this.radiuis = radiuis;
        }

        public double getArea() {
            area = radiuis*radiuis * Math.PI;
            return area;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> calcCircArea = new ArrayList<>();

        //Circle newCirlce = new Circle();
        for (int i = 0; i < 5; i++) {
            double inputRadius = Double.parseDouble(scanner.nextLine());
            Circle newCirlce = new Circle(inputRadius);
            //newCirlce.setRadiuis(inputRadius);
            double newCir = newCirlce.getArea();
            calcCircArea.add(newCir);
        }

        for (int i = 0; i < calcCircArea.size(); i++) {
            System.out.printf("%.2f%n", calcCircArea.get(i));
        }
    }
}
