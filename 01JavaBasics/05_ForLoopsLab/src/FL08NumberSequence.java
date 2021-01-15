<<<<<<< HEAD
import java.util.Scanner;

public class FL08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNum = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (i = 1; i <= nNum; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (maxNum <= num) {
                maxNum = num;
            }

            if (minNum >= num) {
                minNum = num;
            }

        }

        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
=======
import java.util.Scanner;

public class FL08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNum = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (i = 1; i <= nNum; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (maxNum <= num) {
                maxNum = num;
            }

            if (minNum >= num) {
                minNum = num;
            }

        }

        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
>>>>>>> 84f278ffe47f5994021309d5c6465847b089f53d
