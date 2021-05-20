import java.util.ArrayList;
import java.util.Scanner;

public class LU02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStringArray = scanner.nextLine().split("\\s+");
        ArrayList<Integer> listNumb = parseStringInputToIntegerList(inputStringArray);

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputCommandAsArray = input.split("\\s+");

            switch (inputCommandAsArray[0]) {
                case "Delete":
                    int equalElement = Integer.parseInt(inputCommandAsArray[1]);
                    while (listNumb.contains(equalElement)) {
                        listNumb.remove(Integer.valueOf(equalElement));
                    }
                    break;
                case "Insert":
                    Integer element = Integer.valueOf(inputCommandAsArray[1]);
                    int position = Integer.parseInt(inputCommandAsArray[2]);
                    if (position >= 0 && position < listNumb.size()) {
                        listNumb.add(position, element);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        printIntegerList(listNumb);
    }

    private static void printIntegerList(ArrayList<Integer> listNumb) {
        for (Integer elements : listNumb) {
            System.out.print(elements + " ");
        }
    }

    private static ArrayList<Integer> parseStringInputToIntegerList(String[] inputStringArray) {
        ArrayList<Integer> listNumb = new ArrayList<>();
        for (int i = 0; i < inputStringArray.length; i++) {
            listNumb.add(Integer.parseInt(inputStringArray[i]));
        }
        return listNumb;
    }
}
