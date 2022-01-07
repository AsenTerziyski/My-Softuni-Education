import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo09USingFunctionalForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<Integer>> arr = new HashMap<>();
        ArrayList<Integer> inputOneList = new ArrayList<>();
        ArrayList<Integer> inputTwoList = new ArrayList<>();

        String[] inputOne = scanner.nextLine().split(":");
        String[] inputTwo = scanner.nextLine().split(":");
        // numOne:1 2 3 4 5 6
        // numTwo:5 6 7 8 9 0

        String list1Name = inputOne[0];
        String list2Name = inputTwo[0];
        parseList(inputOneList, inputOne);
        parseList(inputTwoList,inputTwo);

        arr.putIfAbsent(list1Name, inputOneList);
        arr.putIfAbsent(list2Name,inputTwoList);

        arr.entrySet().stream().sorted((a,b) -> {
            if (a.getKey().compareTo(b.getKey()) == 0) {
                int sumFirst = a.getValue().stream().mapToInt(x->x).sum();
                int sumSecond = a.getValue().stream().mapToInt(x->x).sum();
                return sumFirst - sumSecond;
            }
            return b.getKey().compareTo(a.getKey());
        })
        .forEach(pair-> {
            System.out.println("Key: " + pair.getKey());
            System.out.println("Value: ");
            pair.getValue().sort((a,b)-> a.compareTo(b));
            for (Integer num : pair.getValue()) {
                System.out.printf("%d ",num);
            }
            System.out.println();
        });

    }

    private static void parseList(ArrayList<Integer> inputOneList, String[] inputOne) {
        for (int i = 0; i <inputOne.length; i+=2) {
            String[] list1 = inputOne[1].split("\\s+");

            for (int j = 0; j <list1.length; j++) {
                inputOneList.add(Integer.parseInt(list1[j]));
            }

        }
    }
}
