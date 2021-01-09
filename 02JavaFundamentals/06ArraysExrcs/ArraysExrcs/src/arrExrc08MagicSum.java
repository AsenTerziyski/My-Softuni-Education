import java.util.Scanner;

public class arrExrc08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] inputArray = inputLine.split(" ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] array = new int[inputArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        // задачата може да се реши с два цикъла:
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == number) {
//                    System.out.printf("%d %d%n", array[i], array[j]);
//                }
//            }
//        }

        // може и с един цикъл да се реши задачата:
        for (int i = 0; i <array.length-1; i++) {
            if (array[i] + array[i+1] == number) {
                System.out.printf("%d %d%n", array[i], array[i+1]);
            }

        }
    }
}