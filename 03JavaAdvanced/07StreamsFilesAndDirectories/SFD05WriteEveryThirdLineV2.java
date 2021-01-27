import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SFD05WriteEveryThirdLineV2 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users" +
                "\\Workstation9" +
                "\\Desktop\\JavaCoffee\\SoftUni" +
                "\\javaAdvanced202101\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\input.txt";

        List<String> strings = Files.readAllLines(Path.of(fileName));
        List<String> lines = new ArrayList<>();

        for (int i = 2; i < strings.size(); i += 3) {
            lines.add(strings.get(i));
        }

        Files.write(Path.of("outPutProblem05.txt"), lines, StandardCharsets.UTF_8);

    }
}
