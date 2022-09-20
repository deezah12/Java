package stack_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Vec cars;
    @BeforeEach
    void setUp(){
        cars = new Stack();
    }

    @Test
    void testThatVecIsEmpty(){
        assertNotNull(cars);
    }

}