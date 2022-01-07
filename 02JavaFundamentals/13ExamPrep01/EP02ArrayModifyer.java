import java.util.Scanner;

public class EP02ArrayModifyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split("\\s+");
        Integer[] numbArray = new Integer[inputArray.length];
        parseAndFillArrayOfIntegerNumbers(inputArray, numbArray);

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] modifier = input.split("\\s+");
            String command = modifier[0];
            switch (command) {
                case "swap":
                    swapArrayNumbersByIndexs(numbArray, modifier);
                    break;
                case "multiply":
                    multiplyaArrayNumbersByIndexes(numbArray, modifier);
                    break;
                case "decrease":
                    extractingNumberFromArrayNumbers(numbArray);
                    break;
            }
            input = scanner.nextLine();
        }
        printArrayOfNumbers(numbArray);
    }

    private static void extractingNumberFromArrayNumbers(Integer[] numbArray) {
        int number = 1;
        for (int i = 0; i < numbArray.length; i++) {
            numbArray[i] = numbArray[i] - number;
        }
    }

    private static void multiplyaArrayNumbersByIndexes(Integer[] numbArray, String[] modifier) {
        int indexM1 = Integer.parseInt(modifier[1]);
        int indexM2 = Integer.parseInt(modifier[2]);
        int tempM1 = numbArray[indexM1];
        numbArray[indexM1] = tempM1 * numbArray[indexM2];
    }

    private static void swapArrayNumbersByIndexs(Integer[] numbArray, String[] modifier) {
        int index1 = Integer.parseInt(modifier[1]);
        int index2 = Integer.parseInt(modifier[2]);
        int temp1 = numbArray[index1];
        numbArray[index1] = numbArray[index2];
        numbArray[index2] = temp1;
    }

    private static void parseAndFillArrayOfIntegerNumbers(String[] inputArray, Integer[] numbArray) {
        for (int i = 0; i < numbArray.length; i++) {
            numbArray[i] = Integer.parseInt(inputArray[i]);
        }
    }

    private static void printArrayOfNumbers(Integer[] numbArray) {
        for (int i = 0; i < numbArray.length; i++) {

            if (numbArray[i] == numbArray[numbArray.length - 1]) {
                System.out.print(numbArray[i]);
            } else {
                System.out.print(numbArray[i] + ", ");
            }

        }
    }
}
