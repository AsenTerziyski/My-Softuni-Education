package CreatePointInRectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DmConsoleReader {
    private BufferedReader bufferedReader;

    public DmConsoleReader() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readLine() {
        try {
            String s = this.bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }


}
