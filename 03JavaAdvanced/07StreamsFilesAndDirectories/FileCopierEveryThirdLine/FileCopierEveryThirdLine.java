package copier;

import java.io.*;

public class FileCopierEveryThirdLine {
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader in;
    private PrintWriter out;
    private String input;
    private String output;

    public FileCopierEveryThirdLine(String input, String output) throws IOException {
        this.input = input;
        this.output = output;
        this.fileReader = new FileReader(this.input);
        this.fileWriter = new FileWriter(this.output);
        this.in = new BufferedReader(fileReader);
        this.out = new PrintWriter(fileWriter);
    }
    public void copyFile () throws IOException {
        try {
            int counter = 1;
            String line = in.readLine();
            //BufferedWriter outOut = this.out;
            while (line != null) {
                //BufferedWriter outOut = this.out;
                if (counter % 3 == 0) {
                    this.out.println(line);
//                    for (int i = 0; i <line.length(); i++) {
//                        if (Character.isDigit(line.charAt(i))) {
//                            this.out.println(line);
//                        } else {
//                            this.out.println("xXx");
//                        }
//                    }
                }
                counter++;
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println(String.format("Executed %s!", this.getClass().getSimpleName()));
            fileReader.close();
            fileWriter.close();
        }
    }
}
