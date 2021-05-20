import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class xL06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfProducts = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            listOfProducts.add(input);
        }
        Collections.sort(listOfProducts);

        for (int i = 0; i < listOfProducts.size(); i++) {
            System.out.println((i + 1) + "." + listOfProducts.get(i));
        }
    }
}
