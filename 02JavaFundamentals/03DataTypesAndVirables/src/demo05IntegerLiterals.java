import java.util.Scanner;

public class demo05IntegerLiterals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hexa = 0xFFFFFFFF; //-1
        long number = 1L;      //1

//        System.out.println(hexa);
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
//        System.out.println(number);
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
//        int a = 0xA8F1;
//        System.out.println(a);
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
//        int b = 0xFE;
//        System.out.println(b);
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
//        double x = 9;
//        double y = 2.5;
//        double division = x % y;
//        System.out.println(division);
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
//        double size = 3.75;
//        int intSize = (int) size;
//        System.out.println(intSize);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        int days = (int) (years * 365.2422);
        System.out.println(days);
    }

}
