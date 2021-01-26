import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SFDdemo02 {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories\\my-demo.txt");
            Scanner scanner = new Scanner(inputStream);
            int oneByte = inputStream.read();
            while (oneByte>=0) {
                // oneByte ще даде ASCII стоносите на символите:
                //System.out.print(oneByte + " ");
                System.out.print(((char) oneByte) + "");
                oneByte = inputStream.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
