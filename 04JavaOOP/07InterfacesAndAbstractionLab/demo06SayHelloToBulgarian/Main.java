package demo06SayHelloToBulgarian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        Bulgarian bulgarian = new Bulgarian(inputName, age);
        bulgarian.sayHello();
        System.out.println(bulgarian.toString());
    }
}
