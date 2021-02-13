import java.util.ArrayDeque;
import java.util.Scanner;

public class SQ01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> integerStack = new ArrayDeque<>();
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(7);
        integerStack.push(10);
        integerStack.push(22);
        integerStack.push(33);
        integerStack.push(50);
        integerStack.push(100);
        integerStack.push(100);
        integerStack.push(100);
        for (Integer integer : integerStack) {
            System.out.println(integer);
        }

        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());

        for (Integer integer : integerStack) {
            System.out.println(integer);
        }

        System.out.println();
        String exit = "";
        for (Integer integer : integerStack) {
            exit = exit + integer + ", ";
        }

        //System.out.println("Integers left: " + exit + ";\nsize is " + integerStack.size());
        System.out.println("Integers left: " + exit.substring(0, exit.length()-2).trim() + ";"+ System.lineSeparator() + "size is: " + integerStack.size());

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        for (int i = 0; i < integerStack.size(); i++) {
            System.out.println(integerStack.peek());
            integerStack.pop();
            i--;
            if (i == 0) {
                break;
            }
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(integerStack.size());
        System.out.println(integerStack.isEmpty());
    }
}
