package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntToStringTest {
    @Test
    void test(){
        assertEquals("54", IntToString.number(54));
        assertEquals("456", IntToString.number(456));
    }
    @Test
    void test2(){
        assertEquals("456", IntToString.num(456));
    }

}