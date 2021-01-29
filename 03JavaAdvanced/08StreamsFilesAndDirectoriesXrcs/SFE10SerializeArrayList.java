import java.io.*;
import java.util.List;
import java.util.regex.Pattern;

public class SFE10SerializeArrayList {
    private static final String PATH = "C:\\Users\\Workstation9" +
            "\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\list.ser";


    public static void main(String[] args) {

        List<Double> list = List.of(4.5, 3.7, 1.0, 8.8);

        try {
            FileOutputStream fos = new FileOutputStream(PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(PATH);
            ObjectInputStream oos = new ObjectInputStream(fis);
            List<Double> deserialisdList = (List<Double>) oos.readObject();
            deserialisdList.forEach(e -> System.out.println(e));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
