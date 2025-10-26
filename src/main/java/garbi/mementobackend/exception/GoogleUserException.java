package garbi.mementobackend.exception;

public class GoogleUserException extends RuntimeException {

    public GoogleUserException() {
        super("No se pudo obtener el usuario de Google.");
    }

    public GoogleUserException(String message) {
        super(message);
    }

    public GoogleUserException(String message, Throwable cause) {
        super(message, cause);
    }
}
