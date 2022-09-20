package chapter11.exception.exercise_11_16;

public class ExceptionA extends  Exception{

    public ExceptionA() {
        super("Exception A");
    }

    public ExceptionA(String message) {
        super(message);
    }

    public ExceptionA(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionA(Throwable cause) {
        super(cause);
    }
}
