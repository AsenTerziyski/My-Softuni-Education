import java.util.Scanner;

public class demo05PrintingArraysOnTheConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = {"one", "two", "three", "four", "five"};

        for (int i = 0; i <strArr.length; i++) {
            System.out.printf("arr[%d] = %s%n", i, strArr[i]);
        }

    }
}
