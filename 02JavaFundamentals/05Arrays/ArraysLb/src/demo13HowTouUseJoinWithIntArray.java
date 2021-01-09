import java.util.Scanner;

public class demo13HowTouUseJoinWithIntArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        String[] newStringIntArray = new String[intArray.length];
        for (int i = 0; i < newStringIntArray.length; i++) {
            newStringIntArray[i] = String.valueOf(intArray[i]);

            // може да се реши и с контаканация:
            // newStringIntArray[i] = intArray[i]+"";

        }
        // за примера делимитъра е " -*- " :
        String outputText = String.join(" -*- ", newStringIntArray);
        System.out.println(outputText);
    }
}
