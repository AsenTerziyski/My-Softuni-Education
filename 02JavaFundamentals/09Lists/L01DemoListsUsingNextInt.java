import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class L01DemoListsUsingNextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nextInt chete intervali, na edin red, na dva reda i t.n:
        int numbers = scanner.nextInt();
        ArrayList<Integer> numbersList = new ArrayList<>();
        while (numbers != 0) {
            numbersList.add(numbers);
            numbers = scanner.nextInt();
        }

        numbersList.remove(Integer.valueOf(4));
        //int length = Array.getLength(numbersList);

        for (Integer integer : numbersList) {
            System.out.print(integer + " ");
        }

        numbersList.remove(5);
        numbersList.remove(Integer.valueOf(7));
        System.out.print("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        for (Integer modifiedInteg : numbersList) {
            System.out.print(modifiedInteg + " ");
        }

    }
}
