import java.util.Scanner;

public class prblm04FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитаме входните данни:
        int leghth = Integer.parseInt(scanner.nextLine());
        int with = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumAquariumLitres = leghth * with * height * 0.001;
        double vulumAquariumLitresNet = volumAquariumLitres - volumAquariumLitres * percent * 0.01;

        // Изход на програмата.
        System.out.printf("%.2f", vulumAquariumLitresNet);
    }
}
