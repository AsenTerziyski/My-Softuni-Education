package demo07CalculateCubeVolume;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double v = Cube.calculateCubeVolume(x);
        System.out.println(v);
        //System.out.println(v);
        //Cube cube = new Cube();
        //System.out.println(cube);

        Cube cube1 = new Cube();
        cube1.setX(10);
        System.out.println(cube1);
    }
}
