import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L09Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStrArray = {"A", "s", "e", "n"};
        String myName = String.join("x",inputStrArray);
        System.out.println(myName);

        for (int i = 0; i <inputStrArray.length; i++) {
            myName = String.format("%s%s%s%s", inputStrArray);
        }
        System.out.println(myName);


        ArrayList<String> proba = new ArrayList<>(Arrays.asList("one", "two"));
        System.out.println(String.join("; ", proba));

    }
}
