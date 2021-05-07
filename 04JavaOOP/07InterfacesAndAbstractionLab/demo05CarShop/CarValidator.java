package demo05CarShop;

public class CarValidator {

    static boolean modelValidate(String carModel) {
        if (carModel == null || carModel.trim().isEmpty() || carModel.equalsIgnoreCase("LadA")) {
            throw new IllegalArgumentException(CarExceptionMessages.MODEL_EXCEPTION);
        }
        return true;
    }

    static boolean colorValidate(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException(CarExceptionMessages.COLOR_EXCEPTION);
        }
        return true;

    }

    static boolean horsePowerValidate(Integer horsePower) {
        if (horsePower == null || horsePower <= 0) {
            throw new IllegalArgumentException(CarExceptionMessages.HORSE_POWER_EXCEPTION);
        }
        return true;
    }

    static boolean countryProducedValidate(String countryProduced) {
        if (countryProduced == null || countryProduced.trim().isEmpty()) {
            throw new IllegalArgumentException(CarExceptionMessages.COUNTRY_EXCEPTION);
        }
        return true;
    }

    static boolean countryProducedValidateCanNotBeSudan(String countryProduced) {
        if (countryProduced.equalsIgnoreCase("SUDAN")) {
            throw new IllegalArgumentException(CarExceptionMessages.COUNTRY_EXCEPTION_SUDAN);
        }
        return true;
    }
}
