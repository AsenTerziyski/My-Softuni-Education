import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prblm05MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] sortedArray = mergeSort(number);
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }


    }

    private static int[] mergeSort(int[] arr) {

        // правя си дъно:
        if (arr.length == 1) {
            return arr;
        }
        int halfIndex = arr.length / 2;
        int[] firstPartition = Arrays.copyOfRange(arr, 0, halfIndex);
        int[] secondPartition = Arrays.copyOfRange(arr, halfIndex, arr.length);

        firstPartition = mergeSort(firstPartition);
        secondPartition = mergeSort(secondPartition);


        return mergeTwoSortedArrays(firstPartition, secondPartition);
    }

    private static int[] mergeTwoSortedArrays(int[] firstPartition, int[] secondPartition) {
        int[] sortedArray = new int[firstPartition.length + secondPartition.length];
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < firstPartition.length && secondIndex < secondPartition.length) {
            if (firstPartition[firstIndex] < secondPartition[secondIndex]) {
                sortedArray[firstIndex + secondIndex] = firstPartition[firstIndex];
                firstIndex++;
            } else {
                sortedArray[firstIndex + secondIndex] = secondPartition[secondIndex];
                secondIndex++;
            }
        }

        while (firstIndex < firstPartition.length) {
            sortedArray[firstIndex + secondIndex] = firstPartition[firstIndex];
            firstIndex++;
        }
        while (secondIndex < secondPartition.length) {
            sortedArray[firstIndex + secondIndex] = secondPartition[secondIndex];
            secondIndex++;
        }

        return sortedArray;
    }
}
