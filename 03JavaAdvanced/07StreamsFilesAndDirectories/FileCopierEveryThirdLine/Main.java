package copier;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Users\\Workstation9\\Desktop" +
                "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
                "\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\demo05dir\\indemo05.txt";
        String output = "C:\\Users\\Workstation9\\Desktop" +
                "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
                "\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\demo05dir\\outdemo05.txt";

        copier.FileCopierEveryThirdLine fileCopier = new copier.FileCopierEveryThirdLine(input, output);

        try {
            fileCopier.copyFile();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Program closed.");
        }

    }
}
