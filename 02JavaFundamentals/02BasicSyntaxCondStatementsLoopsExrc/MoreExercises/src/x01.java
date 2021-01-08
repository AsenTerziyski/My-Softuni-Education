import java.rmi.dgc.VMID;
import java.util.Scanner;

public class x01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int medNum = Integer.MIN_VALUE;
        int numOne = 0;
        int numTwo = 0;
        int numThree = 0;
        for (int i = 1; i <= 3; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i == 1) {
                maxNum = num;
                minNum = num;
                numOne = num;
            }
            if (i == 2) {
                if (maxNum < num) {
                    maxNum = num;
                }

                if (minNum > num) {
                    minNum = num;
                }
                numTwo = num;
            }
            if (i == 3) {
                if (maxNum < num) {
                    maxNum = num;
                }

                if (minNum > num) {
                    minNum = num;
                }
                numThree = num;
            }
        }
        if (numOne < maxNum && numOne > minNum) {
            medNum = numOne;
        } else if (numTwo < maxNum && numTwo > minNum) {
            medNum = numTwo;
        } else if (numThree < maxNum && numThree > minNum) {
            medNum = numThree;
        }
        System.out.println(maxNum);
        System.out.println(medNum);
        System.out.println(minNum);
    }
}
