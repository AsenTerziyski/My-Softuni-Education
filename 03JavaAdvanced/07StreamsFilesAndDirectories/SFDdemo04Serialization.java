import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SFDdemo04Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = "C:\\Users\\Workstation9\\Desktop" +
                "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
                "\\09StreamsFilesAndDirectories" +
                "\\Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\Files-and-Streams";
        List<String> names = new ArrayList<>();
        names.add("Asen");
        names.add("Tsvetanov");
        names.add("Terziysksi");

        //serialization
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("list.txt"));
        outputStream.writeObject(names);
        outputStream.close();

        //deserialization
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("list.txt"));
        List<String> readName =(List<String>) inputStream.readObject();
        for (String s : readName) {
            System.out.println(s);
        }


    }
}
