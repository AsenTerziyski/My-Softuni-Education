import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class demo02 {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\" +
                "SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories\\" +
                "Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\proba.jpg";
        try {
            InputStream in = new FileInputStream(inputPath);
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.print(String.format("%s", Integer.toBinaryString(oneByte)));
                System.out.print(String.format("%d ", oneByte));
                char c = (char) (oneByte -10000);
                System.out.print(c + "+");
                oneByte = in.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
