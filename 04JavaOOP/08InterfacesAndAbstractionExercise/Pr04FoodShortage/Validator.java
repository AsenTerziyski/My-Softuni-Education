package Pr04FoodShortage;


public class Validator {
    static boolean validateBirthDate(String birthDate) {
        if (birthDate == null || birthDate.trim().isEmpty()) {
            String emptyOrNull = ExceptionMessages.EMPTY_OR_NULL;
            throw new IllegalArgumentException(Pr04FoodShortage.ExceptionMessages.NOT_VALID_BDate + " " + emptyOrNull);
        }
        return true;
    }

    static boolean validateId(String id) {
        if (id == null || id.trim().isEmpty()) {
            String emptyOrNull = ExceptionMessages.EMPTY_OR_NULL;
            throw new IllegalArgumentException(Pr04FoodShortage.ExceptionMessages.NOT_VALID_ID + " " + emptyOrNull);
        }
        return true;
    }

    static boolean validateAge(int age) {
        if (age <= 0 || age >= 110) {
            throw new IllegalArgumentException(ExceptionMessages.NOT_VALID_AGE);
        }
        return true;
    }

    static boolean validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            String emptyOrNull = ExceptionMessages.EMPTY_OR_NULL;
            throw new IllegalArgumentException(Pr04FoodShortage.ExceptionMessages.NOT_VALID_NAME + " " + emptyOrNull);
        }
        return true;
    }

    public static boolean validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            String emptyOrNull = ExceptionMessages.EMPTY_OR_NULL;
            throw new IllegalArgumentException(Pr04FoodShortage.ExceptionMessages.NOT_VALID_MODEL + " " + emptyOrNull);
        }
        return true;
    }

    public static boolean validateGroup(String group) {
        if (group == null || group.trim().isEmpty()) {
            String emptyOrNull = ExceptionMessages.EMPTY_OR_NULL;
            throw new IllegalArgumentException(Pr04FoodShortage.ExceptionMessages.NOT_VALID_GROUP + " " + emptyOrNull);
        }
        return true;
    }
}
