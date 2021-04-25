import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class demo06 {
    public static void main(String[] args) {
        Path inPath = Paths.get("C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\demo06dir\\dm06In.txt");
        Path outPath = Paths.get("C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101\\09StreamsFilesAndDirectories\\Java-Advanced-Streams-Files-and-Directories-Resources\\demo06dir\\dm06Out.txt");
        try {
            List<String> lines = Files.readAllLines(inPath);
            List<String> collect = lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
//            List<String> outPutLines = new ArrayList<>();
            for (int i = 0; i <collect.size(); i++) {
                System.out.println(collect.get(i));
//                outPutLines.add(collect.get(i));
            }
//            Collections.sort(lines);
//            Files.write(outPath, outPutLines);
            Files.write(outPath, collect);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
