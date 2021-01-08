import java.util.Scanner;

public class prblm08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDogs = Integer.parseInt(scanner.nextLine());
        int numberOtherAnimals = Integer.parseInt(scanner.nextLine());

        double totalSum = numberDogs * 2.5 + numberOtherAnimals * 4;

        if (numberDogs >= 0 && numberDogs <= 100 && numberOtherAnimals >= 0 && numberOtherAnimals <= 100)
            System.out.print(totalSum);
        System.out.print(" lv.");

    }
}
