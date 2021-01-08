import java.util.Scanner;

public class x07xTheatreProm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        printPrice(dayType, age);
    }

    private static void printPrice(String dayType, int age) {
        String dayTypeSmallLetters = dayType.toLowerCase();
        String price = "";
        switch (dayTypeSmallLetters) {
            case "weekday":
                if (0 <= age && age <= 18) {
                    price = "12$";
                } else if (18 < age && age <= 64) {
                    price = "18$";
                } else if (64 < age && age <= 122) {
                    price = "12$";
                } else {
                    System.out.println("Error!");
                }
                break;
            case "weekend":
                if (0 <= age && age <= 18) {
                    price = "15$";
                } else if (18 < age && age <= 64) {
                    price = "20$";
                } else if (64 < age && age <= 122) {
                    price = "15$";
                } else {
                    System.out.println("Error!");
                }
                break;
            case "holiday":
                if (0 <= age && age <= 18) {
                    price = "5$";
                } else if (18 < age && age <= 64) {
                    price = "12$";
                } else if (64 < age && age <= 122) {
                    price = "10$";
                } else {
                    System.out.println("Error!");
                }
                break;
        }
        System.out.println(price);
    }
}
