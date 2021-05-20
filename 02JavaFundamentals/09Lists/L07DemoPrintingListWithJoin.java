import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L07DemoPrintingListWithJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<String> demoJoin = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        // System.out.println(String.join(";+", demoJoin));
        ArrayList<Integer> demoIntegerJoin = new ArrayList<>(Arrays.asList(1, 2, 35, 4, 5, 6, 7, 8, 99));
        printArrayOfIntegersClean(demoIntegerJoin);
    }

    private static void printArrayOfIntegersClean(ArrayList<Integer> demoIntegerJoin) {
        System.out.println(demoIntegerJoin.toString().replaceAll("[\\[\\],]", ""));
    }
}
