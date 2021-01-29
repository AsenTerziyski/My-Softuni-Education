import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.SplittableRandom;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class SFE12CreateZipFile {

    public static final String FirstFilePath = "C:\\Users\\Workstation9\\Desktop" +
            "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\input.txt";

    public static final String SecondFilePath = "C:\\Users\\Workstation9\\Desktop" +
            "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\inputOne.txt";

    public static final String ThirdFilePath = "C:\\Users\\Workstation9\\Desktop" +
            "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\inputTwo.txt";

    public static final String ZipFilePath = "C:\\Users\\Workstation9\\Desktop" +
            "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\file02.zip";

    public static void main(String[] args) {

        try {

            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(ZipFilePath));
            addToZip(FirstFilePath, zos);
            addToZip(SecondFilePath, zos);
            addToZip(ThirdFilePath, zos);
            zos.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    private static void addToZip(String path, ZipOutputStream zos) throws IOException {

        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);

        String[] tokens = path.split("\\\\");
        String fileName = tokens[tokens.length - 1];
        ZipEntry zipEntry = new ZipEntry(fileName);

        zos.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;

        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }

        fis.close();
    }
}
