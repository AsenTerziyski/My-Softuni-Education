import java.util.ArrayList;
import java.util.Scanner;

public class L10Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        //ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i) + numbers.get(numbers.size()-1);
            numbers.set(i,temp);
            numbers.remove(numbers.size()-1);
        }
        //numbers = temp;

        for (int i = 0; i <numbers.size(); i++) {
            if (i==numbers.size()-1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + "<>");
            }
        }
    }
}
