package GenericsPrblm02GenericArrayCreator;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Integer[] array = ArrayCreator.create(13, 13);
        String[] strings = ArrayCreator.create(String.class, 13, "thirteen");

        for (Integer integer : array) {
            System.out.println(integer);
        }

        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();
        // write your code here
    }
}
