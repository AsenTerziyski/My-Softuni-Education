import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SFDdemo01ReadMyDemoPointTxt {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //String string = scanner.nextLine();
        //System.out.println(string);

        try {
            //Подавам пълния път до файла:
            FileInputStream inputStream = new FileInputStream("C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories\\my-demo.txt");
            Scanner scanner = new Scanner(inputStream);
            String string = scanner.nextLine();
            System.out.println(string);
            // ex e променлива:
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
