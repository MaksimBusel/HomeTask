package by.epam.task2.exception;

public class IncorrectValueException extends RuntimeException {

    public IncorrectValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectValueException(String message) {
        super(message);
    }

    public IncorrectValueException() {
    }
}
