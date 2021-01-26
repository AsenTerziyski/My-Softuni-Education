import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class SFD02WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("out.txt");
        PrintWriter writer = new PrintWriter(outputStream);

        int singleByte = inputStream.read();

        //може с лист, но търсенето в лист е по-бавно.
        Set<Character> punctuationSymbols = new HashSet<>();
        punctuationSymbols.add(',');
        punctuationSymbols.add('.');
        punctuationSymbols.add('!');
        punctuationSymbols.add('?');

        while (singleByte >= 0) {
            //System.out.printf("%s ", Integer.toBinaryString(singleByte));
            // writer.printf("%s ", Integer.toBinaryString(singleByte));
            char symbol = (char) singleByte;

            if (!punctuationSymbols.contains(symbol)) {
                writer.print(symbol);
            }

            singleByte = inputStream.read();

        }

        writer.close();
        inputStream.close();
    }
}
