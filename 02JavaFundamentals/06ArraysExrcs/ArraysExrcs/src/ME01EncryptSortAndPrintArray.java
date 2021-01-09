import java.util.Scanner;

public class ME01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] code = new int[n];
        for (int i = 0; i < n; i++) {
            String inputName = scanner.nextLine();
            int sumVowels = 0;
            int sumConsonants = 0;
            for (int j = 0; j < inputName.length(); j++) {
                char letter = inputName.charAt(j);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                        letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                    sumVowels = sumVowels + letter * inputName.length();
                } else {
                    sumConsonants = sumConsonants + letter / inputName.length();
                }
            }
            code[i] = sumVowels + sumConsonants;
        }

        for (int i = 0; i <code.length; i++) {
            for (int j = i+1; j < code.length; j++) {
                if(code[i] > code[j]) {
                    int temp = code [i];
                    code[i] = code[j];
                    code[j] = temp;
                }
            }
        }
        for (int i = 0; i < code.length; i++) {
            System.out.println(code[i]);
        }
    }
}

