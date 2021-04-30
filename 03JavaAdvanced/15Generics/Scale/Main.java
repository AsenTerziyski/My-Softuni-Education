package Scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftInt = Integer.parseInt(scanner.nextLine());
        int rightInt = Integer.parseInt(scanner.nextLine());
        ScaleDemo scaleDemo = new ScaleDemo(leftInt, rightInt);
        Comparable heavier = scaleDemo.getHeavier();
        System.out.println(heavier);

        double leftD = Double.parseDouble(scanner.nextLine());
        double rightD = Double.parseDouble(scanner.nextLine());
        ScaleDemo scaleDemo1 = new ScaleDemo(leftD, rightD);
        System.out.println(scaleDemo1.getHeavier());

        String leftStr = scanner.nextLine();
        String rightStr = scanner.nextLine();
        ScaleDemo scaleDemo2 = new ScaleDemo(leftStr, rightStr);
        System.out.println(scaleDemo2.getHeavier());
    }
}
