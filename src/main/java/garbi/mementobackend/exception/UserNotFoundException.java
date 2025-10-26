package garbi.mementobackend.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super("El usuario buscado no existe dentro de la Base de datos.");
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
