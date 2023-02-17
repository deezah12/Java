package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelRemoverTest {
    @Test
    void check(){
        assertEquals("hll", VowelRemover.shortCut("hello"));
        assertEquals("hw r y tdy", VowelRemover.shortCut("how are you today"));
    }


}