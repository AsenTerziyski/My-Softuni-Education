package demo06SayHelloToBulgarian;

public class BulgarianValidator {

    static boolean validateAge(int age) {

        return true;
    }

    static boolean validateName(String name) {
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            int letterNumber = (int) letter;
            if (!((letterNumber >= 1040 && letterNumber <= 1071) || (letterNumber >= 97 && letter <= 1103))) {
                throw new IllegalArgumentException("Името трябва да е на кирилица.");
            }
        }
        return true;

    }
}
