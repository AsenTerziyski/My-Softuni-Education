import java.util.Scanner;

public class arrExrc09KaminoFact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dnaLenght = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countSquences = 0;
        int[] sequences = new int[dnaLenght];
        int bestSequences = Integer.MIN_VALUE;
        int bestSum = Integer.MIN_VALUE;
        int[] bestDNAseuence = new int[dnaLenght];
        int sum = 0;
        int countNumber = 0;
        int bestCount = 0;
        int startingIndex = 0;

        while (!command.equals("Clone them!")) {

            String[] seqString = command.split("!+");
            countNumber = countNumber + 1;
            for (int i = 0; i < dnaLenght; i++) {
                sequences[i] = Integer.parseInt(seqString[i]);
                sum = sum + sequences[i];
            }
            for (int i = 0; i < sequences.length - 1; i++) {
                if (sequences[i] == sequences[i + 1]) {
                    countSquences++;
                }
            }
            if (bestSequences <= countSquences) {
                for (int i = 0; i < sequences.length; i++) {
                    if (sequences[i] > bestDNAseuence[i]) {
                        if (bestSum < sum) {
                            bestSum = sum;
                            bestSequences = countSquences;
                            bestDNAseuence = sequences;
                            bestCount = countNumber;
                        }

                    }
                }

            }
            sum = 0;
            countSquences = 0;
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCount, bestSum);
        for (int i : bestDNAseuence) {
            System.out.print(i + " ");
        }

    }
}
