package by.epam.task2.exception;

public class LessZeroException extends RuntimeException {

    public LessZeroException(String message) {
        super(message);
    }

    public LessZeroException() {}
}
