import java.io.*;

public class SFE08GetFolderSize {

    public static final String DIR_PATH = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni" +
            "\\javaAdvanced202101\\10StreamsFilesAndDirectoriesExercises" +
            "\\SFDXrcs\\src\\resources\\Exercises Resources";
    public static final String OUTPUT_PATH = "C:\\Users\\Workstation9\\Desktop\\JavaCoffee\\SoftUni" +
            "\\javaAdvanced202101\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\outputProblem08.txt";
    public static void main(String[] args) {

        try {

            //BufferedReader reader = new BufferedReader(new FileReader(DIR_PATH));
            PrintWriter writer = new PrintWriter(OUTPUT_PATH);

            File folder = new File(DIR_PATH);
            File[] files = folder.listFiles();
            long sum = 0;
            if (files !=null) {

                for (int i = 0; i <files.length; i++) {
                    sum = sum + files[i].length();
                }

            }

            writer.println(String.format("Folder size: %d", sum));
            //reader.close();
            writer.close();

        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
