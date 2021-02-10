package GenericsPrblm02GenericArrayCreator;

public class Main {

    public static void main(String[] args) {

        Integer[] array = ArrayCreator.create(13, 13);
        String[] strings = ArrayCreator.create(String.class, 13, "thirteen");

        for (Integer integer : array) {
            //System.out.println(integer);
            printGen(integer);
        }

        for (String string : strings) {
            System.out.println(string);
            printGen(string);
        }
        System.out.println();
        // write your code here
    }
    public static <T> void printGen(T element) {
        System.out.println(element);
    }
}
