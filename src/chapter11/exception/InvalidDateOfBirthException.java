package chapter11.exception;

public class InvalidDateOfBirthException extends RuntimeException{


    public InvalidDateOfBirthException() {
    }

    public InvalidDateOfBirthException(String message) {
        super(message);
    }

    public InvalidDateOfBirthException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDateOfBirthException(Throwable cause) {
        super(cause);
    }

}
