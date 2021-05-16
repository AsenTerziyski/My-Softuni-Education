import java.util.Scanner;

public class x02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        findAndPrintClosestToZeroPoint(x1,x2,y1,y2);
    }

    private static void findAndPrintClosestToZeroPoint(int x1, int x2, int y1, int y2) {
        double distanceFirstPoint = Math.sqrt(1.00*(x1*x1+y1*y1));
        double distanceSecondPoint = Math.sqrt(1.00*(x2*x2+y2*y2));
        if(distanceFirstPoint<distanceSecondPoint) {
            System.out.printf("(%d, %d)", x1, y1);
        } else if(distanceFirstPoint>distanceSecondPoint) {
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }
    }
}
