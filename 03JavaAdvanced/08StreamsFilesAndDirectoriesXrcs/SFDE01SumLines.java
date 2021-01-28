import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SFDE01SumLines {
    public static final String PATH = "C:\\Users\\Workstation9" +
            "\\Desktop\\JavaCoffee\\SoftUni" +
            "\\javaAdvanced202101\\10StreamsFilesAndDirectoriesExercises" +
            "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {

            String line = reader.readLine(); //ctrl+q
            while (line != null) {

                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    char currentChar = line.charAt(i);
                    sum += (int) currentChar;
                }
                System.out.println(sum);

                line = reader.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
