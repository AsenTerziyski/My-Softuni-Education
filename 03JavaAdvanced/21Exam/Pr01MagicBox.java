import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Pr01MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matix = new int[3][3];

        String[] firstInput = scanner.nextLine().split("\\s+");
        String[] secondInput = scanner.nextLine().split("\\s+");
        //firstQueue
        //secondStack
        ArrayDeque<Integer> firstQueue = new ArrayDeque<>();
        for (int i = 0; i < firstInput.length; i++) {
            int currentNumber = Integer.parseInt(firstInput[i]);
            firstQueue.offer(currentNumber);
        }

        ArrayDeque<Integer> secondStack = new ArrayDeque<>();
        for (int i = 0; i < secondInput.length; i++) {
            int currentNumber = Integer.parseInt(secondInput[i]);
            secondStack.push(currentNumber);
        }

        ArrayList<Integer> claimedItems = new ArrayList<>();

        while (firstQueue.size()>0 && secondStack.size()>0) {

            int firstBoxNumber = firstQueue.peek();
            int secondBoxNumber = secondStack.peek();
            int sum = firstBoxNumber + secondBoxNumber;

            if (sum % 2 == 0) {
                int firstNum = firstQueue.poll();
                int secondNum = secondStack.pop();
                claimedItems.add(firstNum + secondNum);
            } else {
                int secondNum = secondStack.pop();
                firstQueue.offer(secondNum);
            }

        }

        if (firstQueue.size() == 0) {
            System.out.println("First magic box is empty.");
        }

        if (secondStack.size() == 0) {
            System.out.println("Second magic box is empty.");
        }

        int sum = 0;
        for (int i = 0; i <claimedItems.size(); i++) {
            int currentNumber = claimedItems.get(i);
            sum = sum + currentNumber;
        }

        if (sum>=90) {
            System.out.println(String.format("Wow, your prey was epic! Value: %d",sum));
        } else {
            System.out.println(String.format("Poor prey... Value: %d", sum));
        }


        //System.out.println();


    }
}
