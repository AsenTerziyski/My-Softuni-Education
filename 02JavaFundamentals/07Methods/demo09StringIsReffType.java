import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class demo09StringIsReffType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] proba3 = new String[]{"1", "2", "3", "4"};
        String givValue = scanner.nextLine();
        int result = extractIndexOfGivenVallueOfArrayEllement(proba3, givValue);
        System.out.println(result);


    }

    private static int extractIndexOfGivenVallueOfArrayEllement(String[] proba3, String givenValue) {
        String resultAsString = "";
        int result = 0;
        for (int i = 0; i < proba3.length; i++) {
            if (i % 2 == 0) {
                proba3[i] = "x";
            }
            if (proba3[i].equals(givenValue)) {
                resultAsString = proba3[i];
                result = i;
            }
        }
        return result;
    }
}
