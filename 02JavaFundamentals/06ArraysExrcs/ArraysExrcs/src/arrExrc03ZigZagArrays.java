import java.util.Scanner;

public class arrExrc03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstElement = input[0];
            String secondElement = input[1];

            if (i % 2 == 0) {
                firstArray[i] = firstElement;
                secondArray[i] = secondElement;
            } else {
                firstArray[i] = secondElement;
                secondArray[i] = firstElement;
            }
        }

//        for (int i = 0; i < firstArray.length; i++) {
//            System.out.print(firstArray[i] + " ");
//        }

        for (String frst : firstArray) {
            System.out.print(frst + " ");
        }

        System.out.println();

        for (String scnd : secondArray) {
            System.out.print(scnd + " ");
        }

//        for (int i = 0; i < secondArray.length; i++) {
//            System.out.print(secondArray[i] + " ");
//        }

    }
}
