import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class demoStreamChislovi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(13);
        numbers.add(68);
        numbers.add(111);
        numbers.add(256);
        DoubleStream stream1 = numbers.stream().mapToDouble(i->i);
        double sum = stream1.sum();
        System.out.println(sum);

        ArrayList<String> numbersAsString = new ArrayList<>();
        numbersAsString.add("1");
        numbersAsString.add("2");
        numbersAsString.add("3");

        DoubleStream stream2 = numbersAsString
                .stream()
                .mapToDouble(i-> Double.parseDouble(i));

        double sumProba = numbersAsString.stream().mapToDouble(d-> Double.parseDouble(d)).sum();


        double sum2 = stream2.sum();
        System.out.println(sum2);

//        double min = stream2.min().getAsDouble();
//        //System.out.println(count);
    }
}
