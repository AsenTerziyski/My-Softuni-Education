package pr05CustomException;

public class InvalidPersonNameException extends RuntimeException {
    public InvalidPersonNameException (String message) {
        super(message);
    }
}
