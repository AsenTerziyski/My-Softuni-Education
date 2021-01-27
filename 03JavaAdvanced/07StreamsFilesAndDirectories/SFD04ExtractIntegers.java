import java.io.*;
import java.util.Scanner;

public class SFD04ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        FileWriter writer = new FileWriter("outPutProblem04.txt");

//        може и така:
//        FileOutputStream outputStream = new FileOutputStream("outPutProblem03.txt");
//        PrintWriter writer = new PrintWriter(outputStream);

        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                writer.write(String.valueOf(number));
                //System.lineSeparator is symbol for new line:
                writer.write(System.lineSeparator());

            }
            scanner.next();
        }

        writer.flush();
        writer.close();
    }
}
