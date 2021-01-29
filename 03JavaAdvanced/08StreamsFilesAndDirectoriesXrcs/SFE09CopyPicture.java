import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SFE09CopyPicture {
    public static final String PicturePath = "C:\\Users" +
            "\\Workstation9\\Desktop\\JavaCoffee" +
            "\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises" +
            "\\picture.JPG";
    public static final String PictureCopyPath = "C:\\Users\\Workstation9" +
            "\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src" +
            "\\resources" +
            "\\pictureCopy.jpg";

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream(PicturePath);
            FileOutputStream fos = new FileOutputStream(PictureCopyPath);

            int oneByte = fis.read();
            while (oneByte!=-1) {
                fos.write(oneByte);
                oneByte = fis.read();
            }


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
