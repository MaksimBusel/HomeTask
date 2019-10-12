package by.epam.task2.exception;

public class InvalidTypeTransportException extends RuntimeException {

    public InvalidTypeTransportException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTypeTransportException(String message) {
        super(message);
    }

    public InvalidTypeTransportException() {
    }
}
