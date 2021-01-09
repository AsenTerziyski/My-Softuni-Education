import java.util.Scanner;

public class demo14ForeachPokazno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        //for (int i = 0; i <numbers.length; i++) {
        //int number = numbers[i];
        //System.out.println(number);
        //}

        for (int numberProba : numbers) {
            // int num = numberProba;
            System.out.println(numberProba);
        }
    }
}
