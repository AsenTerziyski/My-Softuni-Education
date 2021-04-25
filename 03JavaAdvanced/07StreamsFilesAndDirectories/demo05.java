import java.io.*;
import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Users\\Workstation9\\Desktop" +
                "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
                "\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\demo05dir\\indemo05.txt";
        String output = "C:\\Users\\Workstation9\\Desktop" +
                "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
                "\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\demo05dir\\outdemo05.txt";
        FileReader fileReader = new FileReader(input);
        FileWriter fileWriter = new FileWriter(output);

        try {
            BufferedReader in = new BufferedReader(fileReader);
            PrintWriter out = new PrintWriter(fileWriter);

            int counter = 1;
            String line = in.readLine();
            while (line != null) {

                if (counter % 3 == 0) {
                    out.println(line);
                }

                counter++;
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
            fileWriter.close();
        }

    }
}
