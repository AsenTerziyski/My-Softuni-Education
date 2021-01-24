import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SME02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(inputArray[0]);
        int m = Integer.parseInt(inputArray[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        Set<Integer> thirdSet = new LinkedHashSet<>();

        String input = "";

        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();
            int currentNumber = Integer.parseInt(input);
            firstSet.add(currentNumber);
        }

        for (int i = 0; i < m; i++) {
            input = scanner.nextLine();
            int currentNumber = Integer.parseInt(input);
            secondSet.add(currentNumber);
        }
        //StringBuilder sb = new StringBuilder();
        if (n >= m) {
            for (Integer first : firstSet) {
                int currentFirst = first;

                if (secondSet.contains(currentFirst)) {
                    //sb.append(currentFirst);
                    thirdSet.add(currentFirst);
                }

            }
        } else {
            for (Integer second : secondSet) {
                int currentSecond = second;

                if (firstSet.contains(currentSecond)) {
                    //sb.append(currentSecond);
                    thirdSet.add(currentSecond);
                }

            }
        }
//        for (int i = 0; i <sb.length(); i++) {
//            System.out.print(sb.charAt(i) + " ");
//        }
        for (Integer third : thirdSet) {
            System.out.print(third + " ");
        }
    }
}
