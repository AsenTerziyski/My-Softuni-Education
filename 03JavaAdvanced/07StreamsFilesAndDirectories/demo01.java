import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class demo01 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni" +
                "\\javaAdvanced202101\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\inputOne.txt";
//        FileInputStream fileInputStream = new FileInputStream(path);
//        int oneByte = fileInputStream.read();
//        while (oneByte>=0) {
//            System.out.println(oneByte);
//            oneByte = fileInputStream.read();
//        }

        InputStream in = null;
        try {
            in = new FileInputStream(path);

        } catch (IOException m) {
            throw new IOException("???");

        } finally {
            if (in !=null) {
                in.close();
            }
        }

    }
}
