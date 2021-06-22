package CircleCheckCrossProgram;

class CircleCreator {


   static Circle createCircle(String[] input, int i) {
       String[] circle1data = input[i].split(" ");
       double x = Double.parseDouble(circle1data[0]);
       double y = Double.parseDouble(circle1data[1]);
       double r = Double.parseDouble(circle1data[2]);
       Point2D c1 = new Point2D(x, y);
       return new Circle(c1, r);
    }
}
