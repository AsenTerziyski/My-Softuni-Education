import java.util.Scanner;

public class swapVirables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 7;
        int second = 10;

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println(first);
        System.out.println(second);
    }
}
