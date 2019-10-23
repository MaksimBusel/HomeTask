package by.epam.railway.exception;

public class NumberOfLocomotivesException extends RuntimeException {

    public NumberOfLocomotivesException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberOfLocomotivesException(String message) {
        super(message);
    }

    public NumberOfLocomotivesException() {
    }
}
