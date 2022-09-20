package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStringSpaceTest {
    @Test
    void test(){
        assertEquals("iloveyou",
                RemoveStringSpace.noSpace( "i love you"));
        assertEquals("iameating", RemoveStringSpace.noSpace("i am eating"));
    }

}