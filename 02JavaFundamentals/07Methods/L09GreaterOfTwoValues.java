import java.util.Scanner;

public class L09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputType = scanner.nextLine();
        switch (inputType) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int seondNumber = Integer.parseInt(scanner.nextLine());
                // getMax(firstNumber,seondNumber);
                System.out.println(getMax(firstNumber,seondNumber));
                break;
            case "char":
                char firstChar= scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                // getMax(firstChar, secondChar);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstStr = scanner.nextLine();
                String secondStr = scanner.nextLine();
                // getMax(firstStr, secondStr);
                System.out.println(getMax(firstStr,secondStr));
                break;
        }
    }

    private static int getMax(int a, int b) {
        if (a>b) {
            return a;
        }
        return b;
    }

    static char getMax(char chOne, char chSecond) {
        if (chOne > chSecond) {
            return chOne;
        }
        return chSecond;
    }

    static String getMax(String strOne, String strTwo) {
        //The compareTo() method compares two strings lexicographically.
        //The comparison is based on the Unicode value of each character in the strings.
        //The method returns 0 if the string is equal to the other string.
        // A value less than 0 is returned if the string is less than the other string (less characters)
        // and a value greater than 0 if the string is greater than the other string (more characters).
        if (strOne.compareTo(strTwo) >=0) {
            return strOne;
        }
        return strTwo;
    }
}
