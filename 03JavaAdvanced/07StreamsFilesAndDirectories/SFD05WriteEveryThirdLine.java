import java.io.*;
import java.util.Scanner;

public class SFD05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users" +
                "\\Workstation9" +
                "\\Desktop\\JavaCoffee\\SoftUni" +
                "\\javaAdvanced202101\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));
        BufferedWriter writer = new BufferedWriter(new FileWriter("outPutProblem05.txt"));

        String line = reader.readLine();

        int lineNumber = 1;
        while (line != null) {

            lineNumber++;
            line = reader.readLine();

            if (lineNumber % 3 == 0) {
                //System.out.println(line);
                writer.write(line);
                //writer.write(System.lineSeparator());
                writer.newLine();
            }

        }

        writer.close();
    }
}
