package Pr03ShoppingSpreeWithValidator;

public class Validator {

    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.NAME_EXCEPTION_MESSAGE);
        }
    }

    public static void validateMoney(double money) {
        if (money <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.MONEY_EXCEPTION_MESSAGE);
        }
    }
}
