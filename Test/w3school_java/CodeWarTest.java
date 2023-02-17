package w3school_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeWarTest {
    @Test
    void check(){
//        int[] see = {2, 4, 6, 7, 8, 10};
        int[] see1 = {3, 4, 5, 6, 8, 10};


        assertEquals(5, CodeWar2.array(see1));


    }

}