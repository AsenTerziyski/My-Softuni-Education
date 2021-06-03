package BoxSecond;

class BoxCalculator {

    static double calcSurfaceArea(double length, double width, double height) {
        // Surface Area = 2lw + 2lh + 2wh
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    static double calcLatSurfaceArea(double length, double width, double height) {
        // Lateral Surface Area = 2lh + 2wh
        return 2 * length * height + 2 * width * height;
    }

    static double calcVolume(double length, double width, double height) {
        return length * width * height;
    }
}
