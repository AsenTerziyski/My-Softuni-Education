import java.util.Date;
import java.util.Scanner;

public class demo01Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 Jan 1970 00:00.000
        Date date = new Date();
        // извеждане колко мили секунди са минали от 1970 ???
        System.out.println(date.getTime());
    }
}
