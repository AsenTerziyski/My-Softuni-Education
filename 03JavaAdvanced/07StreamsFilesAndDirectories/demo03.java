import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class demo03 {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\Workstation9\\Desktop" +
                "\\JavaCoffee\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources\\inputX.txt";

        String outputPath = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee" +
                "\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources\\outputX.txt";

        Set<Character> skippedSymbols = new HashSet<>();

        String[] symbols = ",+.+;+!+?".split("\\+");
        FileInputStream inputStream = new FileInputStream(inputPath);
        FileOutputStream outputStream = new FileOutputStream(outputPath);

        for (String symbol : symbols) {
            skippedSymbols.add(symbol.charAt(0));
        }

        try {
            int singleByte = inputStream.read();
            while (singleByte >= 0) {
                if (!skippedSymbols.contains((char) singleByte)) {
                    outputStream.write(singleByte);
                }
                singleByte = inputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Ready!");
            inputStream.close();
            outputStream.close();
        }
    }
}
