import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SFE05LineNumbers {

    public static String INPUTPATH05 = "C:\\Users\\Workstation9" +
            "\\Desktop\\JavaCoffee\\SoftUni" +
            "\\javaAdvanced202101\\10StreamsFilesAndDirectoriesExercises" +
            "\\SFDXrcs\\src\\resources" +
            "\\inputLineNumbers.txt";

    public static String OUTPUTPATH05 = "C:\\Users\\Workstation9" +
            "\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises" +
            "\\SFDXrcs\\src\\resources" +
            "\\outputProblem05.txt";

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(INPUTPATH05));
             PrintWriter writer = new PrintWriter(OUTPUTPATH05)) {
            String line = reader.readLine();
            int number = 1;
            while (line !=null) {
                writer.println(String.format("%d. %s", number, line));
                number++;

                line = reader.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
