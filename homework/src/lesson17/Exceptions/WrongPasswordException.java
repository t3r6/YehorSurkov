package lesson17.Exceptions;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "MultiCatchExceptionDemo{}";
    }
}
