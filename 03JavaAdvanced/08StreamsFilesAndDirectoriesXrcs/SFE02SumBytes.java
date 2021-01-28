import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SFE02SumBytes {

    public static final String PATH02 = "C:\\Users\\Workstation9\\Desktop" +
            "\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises" +
            "\\SFDXrcs\\src\\resources\\input.txt";

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(PATH02))) {

            int sum = 0;
            String line = reader.readLine();
            while (line !=null) {

                for (int i = 0; i <line.length(); i++) {
                    char currentChar = line.charAt(i);
                    sum = sum + (int) currentChar;
                }

                line = reader.readLine();
            }
            System.out.println(sum);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
