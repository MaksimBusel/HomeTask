package by.epam.task1.arrays.exception;

public class FileEmptyException extends RuntimeException {
    public FileEmptyException(String message) {
        super(message);
    }

    public FileEmptyException() {
    }
}