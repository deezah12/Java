package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRepeatTest {
    @Test
    void test(){
        assertEquals("aaaa", StringRepeat.repeat(4,"a"));
    }
    @Test
    void testForzero(){
        assertEquals("", StringRepeat.repeat( 0, "kuli"));
    }
    @Test
    void testEmpty(){
        assertEquals("", StringRepeat.repeat(4, ""));
    }

}