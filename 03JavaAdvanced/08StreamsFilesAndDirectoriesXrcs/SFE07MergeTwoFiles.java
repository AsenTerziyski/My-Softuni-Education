import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

public class SFE07MergeTwoFiles {

    private static final String InputFirst = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee" +
            "\\SoftUni\\javaAdvanced202101\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\inputOne.txt";
    private static final String InputSecond = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee" +
            "\\SoftUni\\javaAdvanced202101\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\inputTwo.txt";
    private static final String OutputThird = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee" +
            "\\SoftUni\\javaAdvanced202101\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\outputProblem07.txt";


    public static void main(String[] args) {

        try {

            BufferedReader firstReader = new BufferedReader(new FileReader(InputFirst));
            BufferedReader secondReader = new BufferedReader(new FileReader(InputSecond));
            PrintWriter writeToThirdFile = new PrintWriter(OutputThird);

            String firstLine = firstReader.readLine();
            while (firstLine != null) {
                System.out.println(firstLine);
                writeToThirdFile.println(firstLine);
                firstLine = firstReader.readLine();
            }

            String secondLine = secondReader.readLine();
            while (secondLine != null) {
                System.out.println(secondLine);
                writeToThirdFile.println(secondLine);
                secondLine = secondReader.readLine();
            }

            //has to be closed:
            writeToThirdFile.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
