import java.util.ArrayList;
import java.util.Scanner;

public class xL05ListManipulationAdvancedThrdTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbList = new ArrayList<>(parseIntegerList(scanner));
        String inputCommand = scanner.nextLine();
        while (!"end".equals(inputCommand)) {
            String[] input = inputCommand.split("\\s+");
            String command = input[0];

            if (command.equals("Contains")) {
                int containsNumber = Integer.parseInt(input[1]);
                if (numbList.contains(containsNumber)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print")) {
                if (input[1].equals("even")) {
                    printIntListEvenNumbs(numbList);
                } else if (input[1].equals("odd")) {
                    printIntListOddNumbs(numbList);
                }
            } else if (command.equals("Get")) {
                printListSum(numbList);

            } else if (command.equals("Filter")) {
                String operator = input[1];
                int conditionNumber = Integer.parseInt(input[2]);
                filterList(operator, conditionNumber, numbList);
            }
            inputCommand = scanner.nextLine();
        }
    }

    private static void filterList(String operator, int conditionNumber, ArrayList<Integer> numbList) {
        switch (operator) {
            case "<":
                ArrayList<Integer> outputOne = new ArrayList<>();
                for (int i = 0; i < numbList.size(); i++) {
                    if (numbList.get(i) < conditionNumber) {
                        outputOne.add(numbList.get(i));
                    }
                }
                printArrayListIntegerWithoutLastInterval(outputOne);
                break;
            case ">":
                ArrayList<Integer> outputTwo = new ArrayList<>();
                for (int i = 0; i < numbList.size(); i++) {
                    if (numbList.get(i) > conditionNumber) {
                        outputTwo.add(numbList.get(i));
                    }
                }
                printArrayListIntegerWithoutLastInterval(outputTwo);
                break;
            case "<=":
                ArrayList<Integer> outputThree = new ArrayList<>();
                for (int i = 0; i < numbList.size(); i++) {
                    if (numbList.get(i) <= conditionNumber) {
                        outputThree.add(numbList.get(i));
                    }
                }
                printArrayListIntegerWithoutLastInterval(outputThree);
                break;
            case ">=":
                ArrayList<Integer> outputFour = new ArrayList<>();
                for (int i = 0; i < numbList.size(); i++) {
                    if (numbList.get(i) >= conditionNumber) {
                        outputFour.add(numbList.get(i));
                    }
                }
                printArrayListIntegerWithoutLastInterval(outputFour);
                break;

        }

    }

    private static void printListSum(ArrayList<Integer> numbList) {
        int sum = 0;
        for (int i = 0; i < numbList.size(); i++) {
            sum = sum + numbList.get(i);
        }
        System.out.println(sum);
    }

    private static void printIntListOddNumbs(ArrayList<Integer> numbList) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numbList.size(); i++) {
            if (numbList.get(i) % 2 != 0) {
                oddNumbers.add(numbList.get(i));
            }
        }

        printArrayListIntegerWithoutLastInterval(oddNumbers);
    }

    private static void printIntListEvenNumbs(ArrayList<Integer> numbList) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbList.size(); i++) {
            if (numbList.get(i) % 2 == 0) {
                evenNumbers.add(numbList.get(i));
            }
        }

        printArrayListIntegerWithoutLastInterval(evenNumbers);
    }

    private static void printArrayListIntegerWithoutLastInterval(ArrayList<Integer> evenNumbers) {
        for (int i = 0; i < evenNumbers.size(); i++) {
            if (i == evenNumbers.size() - 1) {
                System.out.print(evenNumbers.get(i));
            } else {
                System.out.print(evenNumbers.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static ArrayList<Integer> parseIntegerList(Scanner scanner) {
        String[] inputStringArray = scanner.nextLine().split("\\s+");
        ArrayList<Integer> numbList = new ArrayList<>();
        for (int i = 0; i < inputStringArray.length; i++) {
            numbList.add(Integer.parseInt(inputStringArray[i]));
        }
        return numbList;
    }
}
