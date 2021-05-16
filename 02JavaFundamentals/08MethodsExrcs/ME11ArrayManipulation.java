import java.util.Arrays;
import java.util.Scanner;

public class ME11ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(inputArray[1]);
                    if (index >= 0 && index < numbers.length) {
                        exchangeArray(numbers, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (inputArray[1].equals("odd")) {
                        int indexMaxOdd = findMaxOddElementIndex(numbers);
                        if (indexMaxOdd < 0) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(indexMaxOdd);
                        }
                    } else {
                        int indexMaxEven = findMaxEvenElementIndex(numbers);
                        if (indexMaxEven < 0) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(indexMaxEven);
                        }
                    }
                    break;
                case "min":
                    if (inputArray[1].equals("odd")) {
                        int indexMinOdd = findMinOddElementIndex(numbers);
                        if (indexMinOdd < 0) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(indexMinOdd);
                        }
                    } else {
                        int indexMinEven = findMinEvenElementIndex(numbers);
                        if (indexMinEven < 0) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(indexMinEven);
                        }
                    }
                    break;
                case "first":
                    int countFirst = Integer.parseInt(inputArray[1]);
                    if (countFirst > numbers.length) {
                        System.out.println("Invalid count");
                    } else if (inputArray[2].equals("odd")) {
                        printFirstOddNumsCount(numbers, countFirst);
                    } else {
                        printFirstEvenNumsCount(numbers, countFirst);
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(inputArray[1]);
                    if (countLast > numbers.length) {
                        System.out.println("Invalid count");
                    } else if (inputArray[2].equals("odd")) {
                        printLastOddNumsCount(numbers, countLast);
                    } else {
                        printLastEvenNumsCount(numbers, countLast);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(Arrays.toString(numbers));
    }

    private static void printFirstOddNumsCount(int[] arr, int count) {
        String numArr = "[";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count--;
                if (count > 0) {
                    numArr += arr[i] + ", ";
                } else if (count == 0) {
                    numArr += arr[i];
                } else {
                    break;
                }
            }
        }
        if (numArr.endsWith(", ")) {
            numArr = numArr.substring(0, numArr.length() - 2);
        }
        System.out.println(numArr + "]");
    }

    private static void printFirstEvenNumsCount(int[] arr, int count) {
        String numArr = "[";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count--;
                if (count > 0) {
                    numArr += arr[i] + ", ";
                } else if (count == 0) {
                    numArr += arr[i];
                } else {
                    break;
                }
            }
        }
        if (numArr.endsWith(", ")) {
            numArr = numArr.substring(0, numArr.length() - 2);
        }
        System.out.println(numArr + "]");
    }

    private static void printLastOddNumsCount(int[] arr, int count) {
        String numArr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                count--;
                if (count >= 0) {
                    numArr += arr[i] + " ";
                } else {
                    break;
                }
            }
        }
        String[] reversedNumArr = numArr.split(" ");
        String[] result = new String[reversedNumArr.length];
        for (int i = reversedNumArr.length - 1; i >= 0; i--) {
            result[reversedNumArr.length - 1 - i] = reversedNumArr[i];
        }
        System.out.println(Arrays.toString(result));
    }

    private static void printLastEvenNumsCount(int[] arr, int count) {
        String numArr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                count--;
                if (count >= 0) {
                    numArr += arr[i] + " ";
                } else {
                    break;
                }
            }
        }
        String[] reversedNumArr = numArr.split(" ");
        String[] result = new String[reversedNumArr.length];
        for (int i = reversedNumArr.length - 1; i >= 0; i--) {
            result[reversedNumArr.length - 1 - i] = reversedNumArr[i];
        }
        System.out.println(Arrays.toString(result));
    }

    private static int findMinEvenElementIndex(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= minElement) {
                minElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMinOddElementIndex(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] <= minElement) {
                minElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMaxEvenElementIndex(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= maxElement) {
                maxElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMaxOddElementIndex(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] >= maxElement) {
                maxElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static void exchangeArray(int[] arr, int index) {
        // [1,2,3,4,5] => exchange 2 => [4,5,1,2,3]
        int[] first = new int[index + 1];
        int[] second = new int[arr.length - (index + 1)];

        for (int i = 0; i <= index; i++) {
            first[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            second[i - (index + 1)] = arr[i];
        }
        for (int i = 0; i < second.length; i++) {
            arr[i] = second[i];
        }
        for (int i = 0; i < first.length; i++) {
            arr[i + second.length] = first[i];
        }
    }
}
