package codewars;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayToBinaryTest {

    @Test
    void convertBinaryToInt() {

        assertEquals(1, ArrayToBinary.convertBinaryToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
    }
}