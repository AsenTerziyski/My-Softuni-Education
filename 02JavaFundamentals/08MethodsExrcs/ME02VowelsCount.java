import java.util.Scanner;

public class ME02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine();
        printCountVowels(inputWord);
    }

    private static void printCountVowels(String inputWord) {
        String wordLowCase = inputWord.toLowerCase();
        int count = 0;
        //vowels in English are A, E, I, O, U, and sometimes Y.
        for (int i = 0; i < wordLowCase.length(); i++) {
            char vowel = wordLowCase.charAt(i);
            switch (vowel) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
