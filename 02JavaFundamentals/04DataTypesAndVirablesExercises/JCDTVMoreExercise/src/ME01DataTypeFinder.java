import java.sql.SQLOutput;
import java.util.Scanner;

public class ME01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countInteger = 0;
        int countFloatingType = 0;
        int countPoint = 0;
        int countMinus = 0;
        int countPlus = 0;
        while (!input.equals("END")) {
            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                switch (symbol) {
                    case '0':
                        countInteger = countInteger + 1;
                        break;
                    case '1':
                        countInteger = countInteger + 1;
                        break;
                    case '2':
                        countInteger = countInteger + 1;
                        break;
                    case '3':
                        countInteger = countInteger + 1;
                        break;
                    case '4':
                        countInteger = countInteger + 1;
                        break;
                    case '5':
                        countInteger = countInteger + 1;
                        break;
                    case '6':
                        countInteger = countInteger + 1;
                        break;
                    case '7':
                        countInteger = countInteger + 1;
                        break;
                    case '8':
                        countInteger = countInteger + 1;
                        break;
                    case '9':
                        countInteger = countInteger + 1;
                        break;
                    case '.':
                        countPoint++;
                        if (countPoint <= 1) {
                            countFloatingType++;
                        }
                        countInteger = 0;
                        break;
                    case '-':
                        countMinus++;
                    case '+':
                        countPlus++;
                        if (input.charAt(0) == '+' || input.charAt(0) == '-') {
                            continue;
                        } else {
                            countPlus = 100;
                            countMinus = 100;
                        }
                        countFloatingType = 0;
                        countInteger = 0;
                    default:
                        countInteger = 0;
                        countFloatingType = 0;
                        break;
                }
            }

//            //if (input.charAt(0) != '0' && input.charAt(0) != '1' && input.charAt(0) != '2' && input.charAt(0) != '3' && input.charAt(0) != '4' && input.charAt(0) != '5'
//                    && input.charAt(0) != '6' && input.charAt(0) != '7' && input.charAt(0) != '8' && input.charAt(0) != '9' && input.charAt(0) != '-'
//                //&&input.charAt(0) != '-') {
//                //countInteger = 0;
//                //countFloatingType = 0;
//
//            //}

            if (countPlus > 1) {
                countInteger = 0;
                countFloatingType = 0;
            }
            if (countMinus > 0) {
                countInteger = 0;
                countFloatingType = 0;
            }
            if (countPoint > 1) {
                countInteger = 0;
                countFloatingType = 0;
            }
            if (countFloatingType > 0) {
                countInteger = 0;
                    System.out.printf("%s is floating point type%n", input);
            }
            if (countInteger > 0) {
                System.out.printf("%s is integer type%n", input);
            }

            // int inputLenght = input.length();
            if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (countFloatingType == 0 && countInteger == 0) {
                if (input.length() > 1) {
                    System.out.printf("%s is string type%n", input);
                } else if (input.length() == 1) {
                    char symbol = input.charAt(0);
                    System.out.printf("%s is character type%n", input);
                }
            }
            countPoint = 0;
            countFloatingType = 0;
            countInteger = 0;
            countMinus = 0;
            countPlus = 0;
            input = scanner.nextLine();
        }
    }
}
