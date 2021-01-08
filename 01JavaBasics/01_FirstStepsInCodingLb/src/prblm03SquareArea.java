import java.util.Scanner;

public class prblm03SquareArea {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int a = Integer.parseInt(myScanner.nextLine());
        // int b = Integer.parseInt(myScanner.nextLine());
        int area = a * a;
        System.out.println(area);
    }
}
