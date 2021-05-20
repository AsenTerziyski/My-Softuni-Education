import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class demoDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //using static classes
//        LocalDateTime todaAndNow = LocalDateTime.now();
//        System.out.println(todaAndNow);
//
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        double mathFunction = Math.cos(45);
//        System.out.println( mathFunction);
//
//        // using non static classes:
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        Random rnd = new Random();
//        int numb = Integer.parseInt(scanner.nextLine());
//        int rndNumb = rnd.nextInt(numb);
//        System.out.println(rndNumb);

        String[] words = scanner.nextLine().split(" ");
        Random rnd = new Random();
        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = rnd.nextInt(words.length);
            String temp = words[pos1];
            words[pos1] = words[pos2];
            words[pos2] = temp;
        }
        System.out.print(String.join(System.lineSeparator(), words));

    }
}
