package by.epam.arrays.exception;

public class EmptyFileException extends RuntimeException {
    public EmptyFileException(String message) {
        super(message);
    }

    public EmptyFileException() {
    }
}
