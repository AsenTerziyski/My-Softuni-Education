import java.util.Scanner;

public class prblmME05TrainingLab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wNeto = h * 100 - 100;

        //  1. Правя си нови променливи, които закръглям надолу.
        double nDesksPerRow = Math.floor(wNeto / 70);
        double nRows = Math.floor(w * 100 / 120);

        //  System.out.println(nDesksPerRow);
        //  System.out.println(nRows);

        // 2. Дефинирам нова променлива, в която ще сложа крайния борй на местата.
        double numberTotalDesks = 0;

        // 3. Правя иф цикъл да отговаря на условията на задачата:
        if (h >= 3 && w >= h && w <= 100) {
            numberTotalDesks = nDesksPerRow * nRows - 3;
            System.out.printf("%.0f", numberTotalDesks);
        }
    }
}
