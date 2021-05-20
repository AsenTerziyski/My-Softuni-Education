import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class demoDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday = LocalDate.of(2018, 11, 27);
        LocalDate epochDay = LocalDate.EPOCH;


        System.out.println(birthday);
        System.out.println(epochDay);
    }
}
