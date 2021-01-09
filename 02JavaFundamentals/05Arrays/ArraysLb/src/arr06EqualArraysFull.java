import java.util.Scanner;

public class arr06EqualArraysFull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArrayOne = scanner.nextLine().split(" ");

        int[] frstArray = new int[stringArrayOne.length];
        for (int i = 0; i < frstArray.length; i++) {
            frstArray[i] = Integer.parseInt(stringArrayOne[i]);
        }

        String[] stringArrayTwo = scanner.nextLine().split(" ");
        int[] scndArray = new int[stringArrayTwo.length];

        for (int j = 0; j < scndArray.length; j++) {
            scndArray[j] = Integer.parseInt(stringArrayTwo[j]);
        }

        boolean areEqual = true;
        int sum = 0;

        if (frstArray.length == scndArray.length) {
            for (int i = 0; i < frstArray.length; i++) {
                if (frstArray[i] != scndArray[i]) {
                    areEqual = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    break;
                } else {
                    sum = sum + frstArray[i];
                }
            }
        } else {
            areEqual = false;
        }

        if (areEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
