import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SFD01ReadFile {
    public static void main(String[] args) throws IOException {

        //Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        // може да се копира в папката на проекта и да се даде само името на файла:
        //String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        int singleByte = inputStream.read();
        while (singleByte>=0) {
            System.out.printf("%s ", Integer.toBinaryString(singleByte));
            singleByte = inputStream.read();
        }

        inputStream.close();

    }
}
