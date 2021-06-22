package CircleCheckCrossProgram;

class CircleChecker {
    static void checkCircles(Circle circle1, Circle circle2) {

        double a = circle1.getCenterCoordinates().getX() - circle2.getCenterCoordinates().getX();
        double b = circle1.getCenterCoordinates().getX() - circle2.getCenterCoordinates().getY();
        double c = Math.sqrt(a * a + b * b);
        double sumR = circle1.getR() + circle2.getR();

        if (circle1.getCenterCoordinates().getX() == circle2.getCenterCoordinates().getX()
                && circle1.getCenterCoordinates().getY() == circle2.getCenterCoordinates().getY() && circle1.getR() == circle2.getR()) {
            System.out.println("Окръжностите съвпадат!");
            return;
        }

        if (c > sumR) {
            System.out.println("Окръжностите не се пресичат!");
        } else if (c == sumR) {
            System.out.println("Окръжностите се допират!");
        } else {
            System.out.println("Окръжностите се пресичат!");
        }
    }
}
