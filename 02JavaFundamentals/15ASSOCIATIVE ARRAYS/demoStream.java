import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demoStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputStrArray = new ArrayList<>();
        inputStrArray.add("Ae");
        inputStrArray.add("Bb");
        inputStrArray.add("Ccc");
        inputStrArray.add("Dddd");
        inputStrArray.add("Eeeee");
        inputStrArray.add("Ffffff");
        inputStrArray.add("Zzzzzzz");
        inputStrArray.add("0zzzzze");
        inputStrArray.add("wwwwweeeeee");
        inputStrArray.add("0ee");
        inputStrArray.add("aee");
        //Stream <String> stream = inputStrArray.stream();

        List<String> filtered = inputStrArray.stream()
                .filter(w -> w.length() <= 5)
                .filter(e -> e.endsWith("e"))
                .collect(Collectors.toList());
        System.out.println(String.join("*", filtered));

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

        List<String> filteredTwo = filtered.stream()
                .map(w -> w.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(String.join("+", filteredTwo));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        List<String> filteredThree = filteredTwo
                .stream()
                .sorted((a,b) -> a.compareTo(b)).limit(2)
                .collect(Collectors.toList());

        String[] filteredThreeArray = filteredThree.
                toArray(new String[filteredThree.size()]);

        // джойн работи както с масиви, така и с листове:
        //лист
        System.out.println(String.join("ListListList", filteredThree));

        // масив
        System.out.println(String.join("ArrayArrayArray", filteredThreeArray));


    }
}
