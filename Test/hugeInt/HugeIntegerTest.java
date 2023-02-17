package hugeInt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {
    HugeInteger hugeInteger;


    @BeforeEach
    void setUp() {
        hugeInteger = new HugeInteger();
    }

    @Test
    void parseTest() {
        hugeInteger = new HugeInteger("2345");
        System.out.println(hugeInteger);
        int[] expected = {2,3,4,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(Arrays.toString(expected), Arrays.toString(hugeInteger.getNumbers()));

    }
}