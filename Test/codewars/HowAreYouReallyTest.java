package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowAreYouReallyTest {


    @Test
    void check(){
        assertTrue(HowAreYouReally.scores(new int[]{23, 4}, 100));
        assertFalse(HowAreYouReally.scores(new int[]{20,10}, 5));
    }
}