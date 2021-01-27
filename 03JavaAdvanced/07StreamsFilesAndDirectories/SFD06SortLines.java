import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SFD06SortLines {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";

        List<String> lines = Files.readAllLines(Paths.get(fileName)).stream().sorted(String::compareTo).collect(Collectors.toList());

        Files.write(Paths.get("C:\\Users\\Workstation9\\Desktop" +
                "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
                "\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\06.SortLinesOutput.txt"), lines);

    }
}
