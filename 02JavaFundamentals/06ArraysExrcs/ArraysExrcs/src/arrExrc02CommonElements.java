import java.util.Arrays;
import java.util.Scanner;

public class arrExrc02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] firstArray = scanner.nextLine().split(" ");
//        String[] secondArray = scanner.nextLine().split(" ");
//
//        for (int i = 0; i < secondArray.length; i++) {
//            for (int j = 0; j < firstArray.length; j++) {
//                if (secondArray[i].equals(firstArray[j])) {
//                    System.out.print(secondArray[i] + " ");
//                }
//            }
//        }

        //Wtori nachin:

        int[] frstArr = parceToIntArr(scanner);
        int[] scndtArr = parceToIntArr(scanner);

        for (int i = 0; i <frstArr.length ; i++) {
            for (int j = 0; j <scndtArr.length ; j++) {
                if (frstArr[i]==scndtArr[j]) {
                    System.out.print(frstArr[i] + " ");
                }
            }
        }

    }

    private static int[] parceToIntArr(Scanner scanner) {
        int[] numbArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(s -> Integer.parseInt(s)).toArray();
        return numbArray;
    }
}
