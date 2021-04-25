import java.io.*;
import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee" +
                "\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources\\demo04in.txt";

        String outputPath = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee" +
                "\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources\\demo04out.txt";

            FileInputStream inputStream = new FileInputStream(inputPath);
            FileOutputStream outputStream = new FileOutputStream(outputPath);

            Scanner scanner = new Scanner(inputStream);
            PrintWriter out = new PrintWriter(outputStream);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    out.println(scanner.nextInt());
                }
                scanner.next();
            }
            System.out.println("Finished!!!");
            // за да принтирам накрая, трябва да затворя out!
            out.close();

        }

    }

