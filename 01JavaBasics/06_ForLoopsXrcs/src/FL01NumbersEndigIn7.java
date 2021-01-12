import java.util.Scanner;

public class FL01NumbersEndigIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //int i = 0;
        for (int i = 0; i <= 1000; i = i + 1) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
