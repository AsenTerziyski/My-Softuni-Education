import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class SFD08NestedFolders {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Workstation9\\Desktop" +
                "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
                "\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\Files-and-Streams";

        File root = new File(path);
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);
        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    dirs.offer(nestedFile);
                }
            }
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");

    }
}
