package ua.training.util.exception;

public class FileUploadException extends Exception {

    public FileUploadException() {
        super();
    }

    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(String message, Exception cause) {
        super(message, cause);
    }
}
