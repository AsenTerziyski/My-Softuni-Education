import java.util.Scanner;

public class demo18ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i <input.length/2; i++) {
            String temp = input[i];
            input[i] = input[input.length-1 - i];
            input[input.length-1-i] = temp;
        }
        String exit = "";
        for (int i = 0; i <input.length; i++) {
            System.out.print(input[i]+ "/");
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(String.join("+-", input));
    }
}
