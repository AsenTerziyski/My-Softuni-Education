import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class xL03MergingListsOfDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputFirstString = scanner.nextLine();
        String inputSecondString = scanner.nextLine();
        //parseLineOfDoublesList(inputString);
        List<Double> firstList = new ArrayList<>(parseLineOfDoublesList(inputFirstString));
        List<Double> secondList = new ArrayList<>(parseLineOfDoublesList(inputSecondString));
        List<Double> mergedList = new ArrayList<>();

        int indexFirst = 0;
        int indexSecond = 0;
        while (indexFirst < firstList.size() || indexSecond < secondList.size()) {

            if (indexFirst < firstList.size()) {
                mergedList.add(firstList.get(indexFirst));
            }

            if (indexSecond < secondList.size()) {
                mergedList.add(secondList.get(indexSecond));
            }

            indexFirst++;
            indexSecond++;
        }
        mergedList.addAll(indexFirst, firstList);
        //Collections.sort(mergedList);
        //Collections.reverse(mergedList);
        //joinElementsByDelimiter(mergedList, " ");
        //System.out.println(joinElementsByDelimiter(mergedList, " "));
    }

//    private static String joinElementsByDelimiter(ArrayList<Double> mergedList, String delimiter) {
//        String output = " ";
//        for (Double number : mergedList) {
//            // броят на диезите определя до какъв знак след запетаята ще се закръгля
//            output = output + (new DecimalFormat("0.##").format(number) + delimiter);
//        }
//        return output;
//
//    }

    private static ArrayList<Double> parseLineOfDoublesList(String inputString) {
//        String[] inputStringDoublesArray = inputString.split(" ");
        List<Double> listDoubles = Arrays
                .stream(inputString.split("\\s+"))
                .map(s -> Double.parseDouble(s))
                .collect(Collectors.toList());
//        for (int i = 0; i < inputStringDoublesArray.length; i++) {
//            double current = Double.parseDouble(inputStringDoublesArray[i]);
//            listDoubles.add(current);
//        }
        return (ArrayList<Double>) listDoubles;
    }
}
