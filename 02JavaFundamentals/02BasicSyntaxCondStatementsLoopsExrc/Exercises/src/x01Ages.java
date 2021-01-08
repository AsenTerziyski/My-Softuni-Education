import java.util.Scanner;

public class x01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ages = Integer.parseInt(scanner.nextLine());
        String typeOfPerson = "";
        if (ages >= 0 && ages <= 2) {
            typeOfPerson = "baby";
        } else if (3 <= ages && ages <= 13) {
            typeOfPerson = "child";
        } else if (ages >= 14 && ages <= 19) {
            typeOfPerson = "teenager";
        } else if (ages >= 20 && ages <= 65) {
            typeOfPerson = "adult";
        } else if (66 <= ages) {
            typeOfPerson = "elder";
        }
        System.out.println(typeOfPerson);
    }
}
