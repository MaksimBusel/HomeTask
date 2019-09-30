package by.epam.arrays.exception;

public class FileEmptyException extends RuntimeException {
    public FileEmptyException(String message) {
        super(message);
    }

    public FileEmptyException() {
    }
}