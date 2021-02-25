import java.util.Scanner;

public class Pr01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // firstTriangle
//        for (int r = 1; r <= n; r++) {
////            for (int s = 0; s < n - r; s++) {
////                System.out.print(" ");
////            }
////            for (int s = 0; s < r; s++) {
////                System.out.print("* ");
////            }
////            System.out.print(getSpaces(n - r));
////            System.out.println(getStars(r));
////            System.out.print(repeatString(n-r, " "));
////            System.out.print(repeatString(r, "* "));
////            System.out.println();
//        }
        //secondTriangle
//        for (int r = 1; r <= n - 1; r++) {
////            for (int s = 0; s < r; s++) {
////                System.out.print(" ");
////            }
////
////            for (int s = 0; s < n - r; s++) {
////                System.out.print("* ");
////            }
////            System.out.print(repeatString(r, " "));
////            System.out.print(repeatString(n-r, "* "));
////            System.out.println();
//        }
        System.out.println(getTriangleOfStars(n, true));
        System.out.println(getTriangleOfStars(n, false));
    }

    public static String getTriangleOfStars(int n, boolean isUpOriented) {
        StringBuilder output = new StringBuilder();
        for (int r = 1; r <= n; r++) {
            int spacesCount = isUpOriented ? n-r: r;
            int starsCount = isUpOriented ? r : n-r;
            output.append(repeatString(spacesCount, " "));
            output.append(repeatString(starsCount, "* "));
            if (r != n) {
                output.append(System.lineSeparator());
            }
        }
        return output.toString();
    }

    public static String repeatString(int count, String toRepeat) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < count; i++) {
            output.append(toRepeat);
        }
        return output.toString();
    }
//    public static String getSpaces(int count) {
//        StringBuilder output = new StringBuilder();
//        for (int i = 0; i < count; i++) {
//            output.append(" ");
//        }
//        return output.toString();
//    }
//    public static String getStars(int count) {
//        StringBuilder output = new StringBuilder();
//        for (int i = 0; i < count; i++) {
//            output.append("* ");
//        }
//        return output.toString();
//    }
}
