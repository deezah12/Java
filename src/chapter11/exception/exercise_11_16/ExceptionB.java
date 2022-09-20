package chapter11.exception.exercise_11_16;

public class ExceptionB extends  ExceptionA{

    public ExceptionB() {
    }

    public ExceptionB(String message) {
        super(message);
    }

    public ExceptionB(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionB(Throwable cause) {
        super(cause);
    }
}
