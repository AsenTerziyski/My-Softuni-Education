import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SFE03AllCapitals {

    private static String INPUTPATH03 = "C:\\Users" +
            "\\Workstation9\\Desktop" +
            "\\JavaCoffee\\SoftUni" +
            "\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises\\" +
            "SFDXrcs\\src\\resources\\input.txt";

    private static String OUTPUTPATH03 = "C:\\Users" +
            "\\Workstation9\\Desktop" +
            "\\JavaCoffee\\SoftUni" +
            "\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises\\" +
            "SFDXrcs\\src\\resources\\outputProblem03.txt";

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(INPUTPATH03));
             PrintWriter writer = new PrintWriter(OUTPUTPATH03)) {

            String line = reader.readLine();
            while (line != null) {
                writer.println(line.toUpperCase());
                line = reader.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
