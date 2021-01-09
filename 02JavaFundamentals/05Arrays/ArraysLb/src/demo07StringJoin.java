import java.util.Scanner;

public class demo07StringJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] textToJoin = {"Asen", "Tsvetanov", "Terziyski"};

        String joinedText = String.join("-", textToJoin);
        System.out.println(joinedText);
    }
}
