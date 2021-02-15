package IC03StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomStack customStack = new CustomStack();
        String[] initialValues = scanner.nextLine().split(",\\s+");
//      scanner.nextLine().replaceAll("Push","");
        customStack.push(Integer.parseInt(initialValues[0].split("\\s+")[1]));
        for (int i = 1; i < initialValues.length; i++) {
            customStack.push(Integer.parseInt(initialValues[i].trim()));
        }

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            switch (input.split("\\s+")[0]) {
                case "Pop":
                    try {
                        customStack.pop();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Push":
                    customStack.push(Integer.parseInt(input.split("\\s+")[1]));
                    break;
            }

            input = scanner.nextLine();
        }
        //System.out.println();
        for (int i = 0; i <2; i++) {
            for (Integer element : customStack) {
                System.out.println(element);
            }
        }


        // write your code here
    }
}
