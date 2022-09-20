package chapter11.exception.exercise_11_16;

public class ExceptionC extends  ExceptionA{

    public ExceptionC() {
    }

    public ExceptionC(String message) {
        super(message);
    }

    public ExceptionC(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionC(Throwable cause) {
        super(cause);
    }
}
