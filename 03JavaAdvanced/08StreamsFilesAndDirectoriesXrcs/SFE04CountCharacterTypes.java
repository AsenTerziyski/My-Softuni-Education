import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class SFE04CountCharacterTypes {

    public static String INPUTPATH04 = "C:\\Users" +
            "\\Workstation9" +
            "\\Desktop\\JavaCoffee\\SoftUni" +
            "\\javaAdvanced202101\\10StreamsFilesAndDirectoriesExercises" +
            "\\SFDXrcs\\src\\resources\\input.txt";

    public static String OUTPUTPATH04 = "C:\\Users" +
            "\\Workstation9" +
            "\\Desktop\\JavaCoffee\\SoftUni" +
            "\\javaAdvanced202101\\10StreamsFilesAndDirectoriesExercises" +
            "\\SFDXrcs\\src\\resources\\outputProblem04.txt";

    public static void main(String[] args) {

        try (BufferedReader readerFromFile = new BufferedReader(new FileReader(INPUTPATH04));
             PrintWriter writeToFile = new PrintWriter(OUTPUTPATH04)) {

            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            int vowelsCount = 0;
            int consonantsCount = 0;
            Set<Character> punctuation = Set.of('.', ',', '!', '?');
            int countPunctuation = 0;


            String line = readerFromFile.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);

                    if (vowels.contains(symbol)) {
                        vowelsCount++;
                    } else if (punctuation.contains(symbol)) {
                        countPunctuation++;
                    } else if (symbol != ' ') {
                        consonantsCount++;
                    }

                }

                line = readerFromFile.readLine();
            }
            //Vowels: 41
            //Consonants: 72
            //Punctuation: 6
            writeToFile.println(String.format("Vowels: %d", vowelsCount));
            writeToFile.println(String.format("Consonants: %d", consonantsCount));
            writeToFile.println(String.format("Punctuation: %d", countPunctuation));

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
