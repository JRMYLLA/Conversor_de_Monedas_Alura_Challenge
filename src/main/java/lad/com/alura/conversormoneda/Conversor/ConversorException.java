package lad.com.alura.conversormoneda;

public class ConversorException extends Exception {
    public ConversorException(String message) {
        super(message);
    }

    public ConversorException(String message, Throwable cause) {
        super(message, cause);
    }
}