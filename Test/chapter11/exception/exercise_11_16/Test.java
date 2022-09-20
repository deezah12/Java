package chapter11.exception.exercise_11_16;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    public static void main(String[] args) {
        try {
            throw new ExceptionB("Exception B");
        } catch (ExceptionA exception) {
            exception.printStackTrace();
        }

        try {
            throw new ExceptionC("Exception C");
        } catch (ExceptionA exception) {
            exception.printStackTrace();
            //exception.getCause();
        }
    }

}

