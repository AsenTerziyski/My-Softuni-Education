package Pr04FoodShortage;


public class Validator {
    static boolean validateBirthDate(String birthDate) {
        validateStringInput(birthDate, ExceptionMessages.NOT_VALID_BDate);
        return true;
    }



    static boolean validateId(String id) {
        validateStringInput(id, ExceptionMessages.NOT_VALID_ID);
        return true;
    }

    static boolean validateAge(int age) {
        if (age <= 0 || age >= 110) {
            throw new IllegalArgumentException(ExceptionMessages.NOT_VALID_AGE);
        }
        return true;
    }

    static boolean validateName(String name) {
        validateStringInput(name, ExceptionMessages.NOT_VALID_NAME);
        return true;
    }

    public static boolean validateModel(String model) {
        validateStringInput(model, ExceptionMessages.NOT_VALID_MODEL);
        return true;
    }

    static boolean validateGroup(String group) {
        validateStringInput(group, ExceptionMessages.NOT_VALID_GROUP);
        return true;
    }

    private static void validateStringInput(String str, String excMessage) {
        if (str == null || str.trim().isEmpty()) {
            String emptyOrNull = ExceptionMessages.EMPTY_OR_NULL;
            throw new IllegalArgumentException(excMessage + " " + emptyOrNull);
        }
    }

}
