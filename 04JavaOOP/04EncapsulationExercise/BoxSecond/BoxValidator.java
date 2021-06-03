package BoxSecond;

class BoxValidator {
    static void validateSide(double side) {
        if (side<=0) {
            throw new IllegalArgumentException(BoxMessages.notValidSide);
        }
    }
}
