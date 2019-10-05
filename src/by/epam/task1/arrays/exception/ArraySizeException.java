package by.epam.task1.arrays.exception;

public class ArraySizeException extends RuntimeException {

    public ArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArraySizeException(String message) {
        super(message);
    }

    public ArraySizeException() {}
}
