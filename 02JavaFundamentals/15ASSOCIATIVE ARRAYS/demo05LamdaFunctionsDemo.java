import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class demo05LamdaFunctionsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputStrArray = new ArrayList<>();
        inputStrArray.add("A");
        inputStrArray.add("Bb");
        inputStrArray.add("Ccc");
        inputStrArray.add("Dddd");
        inputStrArray.add("Eeeee");
        inputStrArray.add("Ffffff");
        inputStrArray.add("Zzzzzzz");

        System.out.println("1.zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        Collections.sort(inputStrArray, (o1, o2) -> o1.compareTo(o2));
        System.out.println(String.join("-", inputStrArray));

        System.out.println("2.zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        Collections.sort(inputStrArray, (o1, o2) -> o2.compareTo(o1));
        System.out.println(String.join("*", inputStrArray));

        System.out.println("3.zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        //sortirane po dylzhina na dumata.
        //Ako gi obyrna o1 i o2 shte gi sortira v obratniya red
        Collections.sort(inputStrArray, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        System.out.println(String.join("-", inputStrArray));

        System.out.println("4.zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        Collections.sort(inputStrArray, (o1, o2) -> Integer.compare(o2.length(), o1.length()));
        System.out.println(String.join("-", inputStrArray));

    }
}
