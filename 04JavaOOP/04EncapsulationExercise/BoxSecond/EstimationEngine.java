package BoxSecond;

import java.util.Scanner;

class EstimationEngine {
    static void estimateBox() {
        Scanner scanner = new Scanner(System.in);
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        BoxSecond box = new BoxSecond(l, w, h);
        BoxPrinter.printBox(box);
    }
    static {
        System.out.println("Enter box length, width and height:");
    }
}
