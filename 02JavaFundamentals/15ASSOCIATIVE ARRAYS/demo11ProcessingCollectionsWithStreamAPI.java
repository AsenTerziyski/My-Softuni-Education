import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo11ProcessingCollectionsWithStreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> numbersList = new ArrayList<>();
//        int[] num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(s -> Integer.parseInt(s)).toArray();
//        for (int i : num) {
//            numbersList.add(i);
//        }
//        int min = numbersList.stream().mapToInt(Integer::intValue).min().getAsInt();
//        System.out.println(min);
//
//        int max = numbersList
//                .stream()
//                .mapToInt(Integer::intValue)
//                .max()
//                .getAsInt();
//
//        System.out.println(max);
//
//        double average = numbersList
//                .stream()
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();
//
//        System.out.println(String.format("%.10f", average));

        int minProba = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(s-> Integer.parseInt(s))
                .min().getAsInt();

        int maxProba = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(s-> Integer.parseInt(s))
                .max().getAsInt();

        double avearage = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(s-> Integer.parseInt(s))
                .average().getAsDouble();

        System.out.println(minProba);
        System.out.println(maxProba);
        System.out.println(String.format("%.3f",avearage));



    }
}
