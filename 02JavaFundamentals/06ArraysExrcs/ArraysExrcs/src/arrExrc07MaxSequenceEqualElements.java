import java.util.Scanner;

public class arrExrc07MaxSequenceEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split(" ");
        int[] numbers = new int[inputString.length];

        for (int i = 0; i < inputString.length; i++) {
            numbers[i] = Integer.parseInt(inputString[i]);
        }

        int maxSequence = Integer.MIN_VALUE;
        int countSequence = 0;
        int currentNumb = 0;
        for (int i = 0; i < numbers.length-1; i++) {

            if (numbers[i] == numbers[i + 1]) {
                countSequence++;
            } else {
                countSequence = 0;
            }

            if (countSequence > maxSequence) {
                // ако имам >= ще ми вземе последната поредица от съвпадения!
                maxSequence = countSequence;
                currentNumb = numbers[i];
            }

        }
        for (int i = 0; i <=maxSequence; i++) {
            System.out.print(currentNumb + " ");
        }
    }
}
