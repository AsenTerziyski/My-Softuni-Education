package IOUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pattern = ", ";
        ConsoleReader consoleReader = new ConsoleReader();
        String input = consoleReader.readLine();
        int[] ints = InputParser.parseArray(input, pattern);
        PrintArray.PrintIntegerArray(ints);
    }
}
