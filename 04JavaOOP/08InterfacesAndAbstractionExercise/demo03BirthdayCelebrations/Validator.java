package demo03BirthdayCelebrations;

public class Validator {
    static boolean validateBirthDate(String birthDate) {
        if (birthDate == null || birthDate.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.NOT_VALID_BDate);
        }
        return true;
    }

    static boolean validateId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.NOT_VALID_ID);
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
            throw new IllegalArgumentException(ExceptionMessages.NOT_VALID_NAME);
        }
        return true;
    }

    public static boolean validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.NOT_VALID_MODEL);
        }
        return true;
    }
}
