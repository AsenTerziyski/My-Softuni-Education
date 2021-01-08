import java.util.Scanner;

public class x01MinMidMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());
        printSortedNumbersMaxMidMin(numOne, numTwo, numThree);

    }

    private static void printSortedNumbersMaxMidMin(int first, int second, int third) {
        int max;
        int mid;
        int min;
        if (first > second) {
            max = first;
            min = second;
        } else {
            max = second;
            min = first;
        }
        if (third > max) {
            mid = max;
            max = third;
        } else if (third < min) {
            mid = min;
            min = third;
        } else {
            mid = third;
        }
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
